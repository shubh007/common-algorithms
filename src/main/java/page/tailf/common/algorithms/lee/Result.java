package page.tailf.common.algorithms.lee;

public class Result {
    private Boolean isPathAvailable;
    private Long distance;

    public Result() {
        this.isPathAvailable = false;
        this.distance = Long.MAX_VALUE;
    }

    public Boolean getPathAvilable() {
        return isPathAvailable;
    }

    public void setPathAvilable(Boolean pathAvilable) {
        isPathAvailable = pathAvilable;
    }

    public long getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance.longValue();
    }

    @Override
    public String toString() {
        return "Result{" +
            "isPathAvailable=" + isPathAvailable +
            ", distance=" + distance +
            '}';
    }
}
