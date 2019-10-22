package page.tailf.common.algorithms.lee;

public class TraverseMaze extends LeeAlgorithm {

    //In this case only 4 direction are allowed
    // Left, Right, Top, Bottom
    public void configure() {
        this.setPathLength(4);
        this.setObstacle(0);
        this.setxPaths(-1,0,0,1);
        this.setyPaths(0,-1,1,0);
    }

    //Init the configuration
    public TraverseMaze() {
        configure();
    }
}
