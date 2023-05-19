package Ex1;

import Ex3.Point2D;

public class Line {

    private Point2D from;
    private Point2D to;

    public Line(Point2D from, Point2D to) {
        this.from = from;
        this.to = to;
    }

    public double calculateLine(){
        return from.getDistance(to);
    }


}
