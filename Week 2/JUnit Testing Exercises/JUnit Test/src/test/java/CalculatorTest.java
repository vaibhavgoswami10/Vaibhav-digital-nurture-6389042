import junit.Calculator;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator cal;

    @Before
    public void setUp() {
        cal = new Calculator();
        System.out.println("Testing Started.");
    }

    @After
    public void tearDown() {
        cal = null;
        System.out.println("Testing completed.");
    }

    @Test
    public void testAddition() {
        int res = cal.add(5,6);
        assertEquals("Addition result should be 11", 11, res);
    }

    @Test
    public void testSubtract(){
        int res=cal.subtract(5,6);
        assertEquals("Subtraction result should be -1",-1,res);
    }

    @Test
    public void testMultiply(){
        int res = cal.multiply(5,6);
        assertEquals("Product should be 30",30,res);
    }

    @Test
    public void testDivision() {
        int result = cal.divide(10,2);
        assertEquals("Division result should be 5", 5, result);
    }

    @Test(expected = ArithmeticException.class)
    public void testDivisionByZero() {
        cal.divide(10,0);
    }
}
