import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void canAdd(){
        assertEquals(10, calculator.addition(5,5));
    }

    @Test
    public void canSub(){
        assertEquals(0, calculator.subtraction(5,5));
    }

    @Test
    public void canMultiply(){
        assertEquals(25, calculator.multiplication(5,5));
    }

    @Test
    public void canDivide(){
        assertEquals(10.0, calculator.division(20,2));
    }
}



