package page.tailf.common.algorithms.lee;

public class KnightRider extends LeeAlgorithm{

    //In this case 8 direction are allowed
    //i.e. all possible direction of knight
    public void configure() {
        this.setPathLength(8);
        this.setObstacle(0);
        this.setxPaths(-2,-2,-1,1,2,2,-1,1);
        this.setyPaths(-1,1,2,2,-1,1,-2,-2);
    }
    public KnightRider() {
        configure();
    }

}
