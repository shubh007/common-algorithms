package page.tailf.common.algorithms.lee;


public class Node {

    private Integer x;
    private Integer y;
    private Integer distance;

    public Node(Integer x, Integer y) {
        this.x = x;
        this.y = y;
        this.distance=0;
    }

    public Node(Integer x, Integer y, Integer distance) {
        this.x = x;
        this.y = y;
        this.distance = distance;
    }

    public Integer getX() {
        return x;
    }

    public void setX(Integer x) {
        this.x = x;
    }

    public Integer getY() {
        return y;
    }

    public void setY(Integer y) {
        this.y = y;
    }

    public Integer getDistance() {
        return distance;
    }

    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Node)) {
            return false;
        }
        Node node = (Node) o;
        return getX().equals(node.getX()) &&
           getY().equals(node.getY());
    }

    @Override
    public int hashCode() {
        return getX().hashCode()+getY().hashCode();
    }

    @Override
    public String toString() {
        return "Node{" +
            "x=" + x +
            ", y=" + y +
            ", distance=" + distance +
            '}';
    }
}
