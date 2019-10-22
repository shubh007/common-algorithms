package page.tailf.common.algorithms.lee;

import java.util.LinkedList;
import java.util.Queue;

public abstract class LeeAlgorithm {

    // Function to check if it is possible to go to position (currX, currY)
    // from current position. The function returns false if (currX, currY)
    // is not a valid position or has obstacle or it is already visited
    private Boolean isValidMove(boolean isVisitedMatrix[][],Integer originalMatrix[][],
        Integer noOfRows,Integer noOfColumns,Integer currX,Integer currY){
        if(obstacle != null) {
            return (currX >= 0
                && currX < noOfRows
                && currY >= 0
                && currY < noOfColumns
                && !isVisitedMatrix[currX][currY]
                && !originalMatrix[currX][currY].equals(obstacle));
        }
        return (currX>=0
            && currX< noOfRows
            && currY>=0
            && currY<noOfColumns
            && !isVisitedMatrix[currX][currY]);

    }
    // Below arrays details all possible movements from a cell
    private Integer xPaths[];
    private Integer yPaths[];

    // Length of all possible movements array from a cell
    private Integer pathLength;

    // value which cant be visited
    private Integer obstacle;

    public void setxPaths(Integer... xPaths) {
        this.xPaths = xPaths;
    }
    public void setyPaths(Integer... yPaths) {
        this.yPaths = yPaths;
    }
    public void setPathLength(Integer pathLength) {
        this.pathLength = pathLength;
    }
    public void setObstacle(Integer obstacle) {
        this.obstacle = obstacle;
    }

    //Configure xPaths, yPaths, pathLength and obstacle
    //depending on type of movements allowed
    //e.g. only 4 directions or 8 directions from cell in matrix
    public abstract void configure();

    // Find Shortest Possible Route in a matrix mat from source
    // cell (initNode) to destination cell (targetNode)
    public Result search(Integer originalMatrix[][],Integer noOfRows,Integer noOfColumns,
        Node initNode,Node targetNode){

        // create default Result with isPathAvailable = false and distance = Long.MAX_VALUE
        Result result = new Result();

        // construct a matrix to keep track of visited cells
        boolean isVisitedMatrix[][] = new boolean[noOfRows][noOfColumns];

        // create an empty queue
        Queue<Node> queue = new LinkedList<Node>();

        // mark source cell as visited and enqueue the source node
        isVisitedMatrix[initNode.getX()][initNode.getY()]=true;
        queue.add(initNode);

        // run till queue is not empty
        while (!queue.isEmpty()){

            // pop front node from queue and process it
            Node currNode = queue.poll();

            // if destination is found, update Result and stop
            if(currNode.equals(targetNode)){
                result.setDistance(currNode.getDistance());
                result.setPathAvilable(true);
                return result;
            }

            // check for all possible movements from current cell
            // and enqueue each valid movement
            for(int i = 0;i<pathLength;i++){

                Integer currX = currNode.getX()+xPaths[i];
                Integer currY = currNode.getY()+yPaths[i];

                // check if it is possible to go to position
                if(isValidMove(isVisitedMatrix,originalMatrix,noOfRows,noOfColumns,currX,currY)){
                    Node nextNode = new Node(currNode.getX()+xPaths[i],currNode.getY()+yPaths[i]
                        ,currNode.getDistance()+1);

                    // mark next cell as visited and enqueue it
                    isVisitedMatrix[nextNode.getX()][nextNode.getY()]=true;
                    queue.add(nextNode);
                }
            }
        }

        return result;
    }

}
