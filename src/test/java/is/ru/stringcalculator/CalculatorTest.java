package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	public static void main(String args[]) {
      org.junit.runner.JUnitCore.main("is.ru.stringcalculator.CalculatorTest");
    }

	@Test
	public void testEmptyString()throws exception {
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber()throws exception {
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoNumbers()throws exception {
		assertEquals(3, Calculator.add("1,2"));
	}

	@Test
	public void testMultipleNumbers()throws exception {
    	assertEquals(6, Calculator.add("1,2,3"));
        }
	@Test
	public void testNewlineDelimited()throws exception{
	assertEquals(3, Calculator.add("1\n2"));
	}
	@Test(expectedExceptions=Exeption.class)
	public void negativeInputReturnsException()throws exception {
		Calculator.add("-1");
	}
	@Test
	public void largeInputsIgnored()throws exception {
		assertEquals(10, Calculator.add("10,1001");
	}
	@Test
	public void customDelimiter()throws exception{
		assertEquals(3, Calculator.add("//;\n1,2");
	}
}
