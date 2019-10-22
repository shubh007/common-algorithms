package page.tailf.common.algorithms.lee;

import org.junit.Assert;
import org.junit.Test;

public class TraverseMazeTest {

    @Test
    public void testMaze() {
        TraverseMaze traverseMaze = new TraverseMaze();
        Integer originalMatrix[][] ={
            { 1, 1, 1, 1, 1, 0, 0, 1, 1, 1 },
            { 0, 1, 1, 1, 1, 1, 0, 1, 0, 1 },
            { 0, 0, 1, 0, 1, 1, 1, 0, 0, 1 },
            { 1, 0, 1, 1, 1, 0, 1, 1, 0, 1 },
            { 0, 0, 0, 1, 0, 0, 0, 1, 0, 1 },
            { 1, 0, 1, 1, 1, 0, 0, 1, 1, 0 },
            { 0, 0, 0, 0, 1, 0, 0, 1, 0, 1 },
            { 0, 1, 1, 1, 1, 1, 1, 1, 0, 0 },
            { 1, 1, 1, 1, 1, 0, 0, 1, 1, 1 },
            { 0, 0, 1, 0, 0, 1, 1, 0, 0, 1 },
        };
        Integer noOfRows = 10;
        Integer noOfColumns =10;
        Node initNode = new Node(0, 0);
        Node targetNode = new Node(7, 5);
        Result result = traverseMaze.search(originalMatrix,noOfRows,noOfColumns,initNode,targetNode);
        Assert.assertEquals(true,result.getPathAvilable());
        Assert.assertEquals(12,result.getDistance());
    }

    @Test
    public void testKnight(){
        KnightRider knightRider =new KnightRider();
        Integer originalMatrix[][] ={
            { 1, 1, 1, 1, 1, 1, 1, 1 },
            { 1, 1, 1, 1, 1, 1, 1, 1 },
            { 1, 1, 1, 1, 1, 1, 1, 1 },
            { 1, 1, 1, 1, 1, 1, 1, 1 },
            { 1, 1, 1, 1, 1, 1, 1, 1 },
            { 1, 1, 1, 1, 1, 1, 1, 1 },
            { 1, 1, 1, 1, 1, 1, 1, 1 },
            { 1, 1, 1, 1, 1, 1, 1, 1 }
        };

        Integer noOfRows = 8;
        Integer noOfColumns =8;
        Node initNode = new Node(0, 0);
        Node targetNode = new Node(4, 2);
        Result result = knightRider.search(originalMatrix,noOfRows,noOfColumns,initNode,targetNode);
        Assert.assertEquals(true,result.getPathAvilable());
        Assert.assertEquals(2,result.getDistance());
    }
}