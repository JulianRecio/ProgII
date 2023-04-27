import Ex3.Point2D;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class Point2DTest {

    @Test
    public void testWhen3PointsAreLoaded(){
        Point2D a = new Point2D(2,3);
        Point2D b = new Point2D(4,5);
        Point2D c = new Point2D(5,5);

        Point2D ab = a.add(b);

        Assertions.assertEquals(6, ab.getX());
        Assertions.assertEquals(8, ab.getY());

        ArrayList<Point2D> points = new ArrayList<>();

        points.add(a);
        points.add(b);
        points.add(c);

        Assertions.assertEquals(c.getDistanceToOrigin(), a.getMaxDistanceToOrigin(points));

    }
}
