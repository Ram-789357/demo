import static org.junit.Assert.*;
import org.junit.Test;

public class CalculatorTest {

    Calculator calc = new Calculator();

    @Test
    public void testAdd() {
        assertEquals(5, calc.add(2, 3));
        assertEquals(19, calc.add(15, 4));
    }
}

