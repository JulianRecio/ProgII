import Ex3.Point2D;
import Ex4.Circle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CircleTest {
    @Test
    public void testCircle(){
        Point2D c = new Point2D(5,5);
        Circle circle = new Circle(c,3);

        Assertions.assertEquals(false, circle.contains(new Point2D(10,10)));
        Assertions.assertEquals(true, circle.contains(new Point2D(5,6)));
        Assertions.assertEquals(3 * 2 * Math.PI, circle.perimeter());
    }
}
