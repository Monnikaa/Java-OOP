package _1WorkingWithAbstraction;

public class _2Rectangle {
    private _2Point bottomLeft;
    private _2Point topRight;

    public _2Rectangle(_2Point bottomLeft, _2Point topRight) {
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }

    private  _2Point getTopRight() {
        return topRight;
    }

    private  _2Point getBottomLeft() {
        return bottomLeft;
    }
    public boolean contains(_2Point point){
        boolean isInBounds = getBottomLeft().getX() <= point.getX() &&
                             getTopRight().getX() >= point.getX() &&
                             getBottomLeft().getY() <= point.getY() &&
                             getTopRight().getY() >= point.getY();
            return isInBounds;
    }
}
