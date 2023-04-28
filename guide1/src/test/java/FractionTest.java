import Ex6.Fraction;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FractionTest {

    @Test
    public void testAddFraction(){
        Fraction fraction1 = new Fraction(2,3);
        Fraction fraction2 = new Fraction(3,4);

        Fraction result = fraction1.add(fraction2);

        Assertions.assertEquals(17, result.getDividend());
        Assertions.assertEquals(12, result.getDivisor());
    }

    @Test
    public void testSubFraction(){
        Fraction fraction1 = new Fraction(2,3);
        Fraction fraction2 = new Fraction(1,4);

        Fraction result = fraction1.sub(fraction2);

        Assertions.assertEquals(5, result.getDividend());
        Assertions.assertEquals(12, result.getDivisor());
    }

    @Test
    public void testAddNumber(){
        Fraction fraction1 = new Fraction(2,3);

        Fraction result = fraction1.add(3);

        Assertions.assertEquals(11, result.getDividend());
        Assertions.assertEquals(3, result.getDivisor());
    }

    @Test
    public void testMulFraction(){
        Fraction fraction1 = new Fraction(2,3);
        Fraction fraction2 = new Fraction(5,4);

        Fraction result = fraction1.mul(fraction2);

        Assertions.assertEquals(5, result.getDividend());
        Assertions.assertEquals(6, result.getDivisor());
    }

    @Test
    public void testDivFraction(){
        Fraction fraction1 = new Fraction(2,3);
        Fraction fraction2 = new Fraction(4,7);

        Fraction result = fraction1.div(fraction2);

        Assertions.assertEquals(7, result.getDividend());
        Assertions.assertEquals(6, result.getDivisor());
    }

    @Test
    public void testAsFloat(){
        Fraction fraction1 = new Fraction(2,4);

        float result = fraction1.asFloat();

        Assertions.assertEquals(0.5, result);
    }

    @Test
    public void testEquals(){
        Fraction fraction1 = new Fraction(2,3);
        Fraction fraction2 = new Fraction(6,9);
        Fraction fraction3 = new Fraction(4,5);

        boolean equalResult = fraction1.equals(fraction2);
        boolean unequalResult = fraction1.equals(fraction3);

        Assertions.assertTrue(equalResult);
        Assertions.assertFalse(unequalResult);
    }
}
