import org.junit.Test;
import static org.junit.Assert.*;

public class TwoStackTest {

    @Test
    public void testSimpleAddition() {
        TwoStack calculator = new TwoStack();
        assertEquals(5.0, calculator.evaluate("( 2 + 3 )"), 0.001);
    }

    @Test
    public void testSimpleSubtraction() {
        TwoStack calculator = new TwoStack();
        assertEquals(2.0, calculator.evaluate("( 5 - 3 )"), 0.001);
    }

    @Test
    public void testSimpleMultiplication() {
        TwoStack calculator = new TwoStack();
        assertEquals(15.0, calculator.evaluate("( 3 * 5 )"), 0.001);
    }

    @Test
    public void testSimpleDivision() {
        TwoStack calculator = new TwoStack();
        assertEquals(2.0, calculator.evaluate("( 6 / 3 )"), 0.001);
    }

    @Test
    public void testComplexExpression() {
        TwoStack calculator = new TwoStack();
        assertEquals(12.0, calculator.evaluate("( ( 1 + 2 ) * ( 3 + 1 ) )"), 0.001);
    }

    @Test
    public void testNestedParentheses() {
        TwoStack calculator = new TwoStack();
        assertEquals(21.0, calculator.evaluate("( ( ( 2 + 3 ) * ( 4 + 1 ) ) - 4 )"), 0.001);
    }

    @Test
    public void testMultipleOperations() {
        TwoStack calculator = new TwoStack();
        assertEquals(7.0, calculator.evaluate("( ( 3 + 4 ) * ( 2 - 1 ) )"), 0.001);
    }

}

