import Ex2.Rectangle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTest {

    @Test
    public void testCreateRectangle(){
        Rectangle rectangle1 =  new Rectangle(10,5);

        Assertions.assertEquals(10, rectangle1.getBase());
        Assertions.assertEquals(5, rectangle1.getHeight());
    }

    @Test
    public void testCalculateArea(){
        Rectangle rectangle1 = new Rectangle(10,5);
        Rectangle rectangle2 = new Rectangle(23, 7);

        Assertions.assertEquals(50, rectangle1.calculateArea());
        Assertions.assertEquals(161, rectangle2.calculateArea());
    }


}
