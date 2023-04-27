package Ex3;

import java.util.ArrayList;

public class Point2D {

    private double x;
    private double y;

    public Point2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(Point2D point2D){
        return Math.sqrt(Math.pow(point2D.getX() - getX(), 2) + Math.pow(point2D.getY() - getY(), 2));
    }

    public Point2D add(Point2D point2D){
        return new Point2D(getX() + point2D.getX(), getY() + point2D.getY());
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDistanceToOrigin(){
        return getDistance(new Point2D(0,0));
    }

    public double getMaxDistanceToOrigin(ArrayList<Point2D> points){
        ArrayList<Double> distanceList = new ArrayList<Double>();

        for (Point2D point :
                points) {
            distanceList.add(point.getDistanceToOrigin());
        }

        double maxDistance = 0;
        for (int i = 0; i < distanceList.size(); i++) {
            if(maxDistance < distanceList.get(i)){
                maxDistance = distanceList.get(i);
            }
        }

        return maxDistance;
    }
}
