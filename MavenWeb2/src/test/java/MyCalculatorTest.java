import static org.junit.Assert.*;

import org.junit.Test;

import com.Jenk.MyCalculator;

public class MyCalculatorTest {

	@Test
	public void test1() {
		assertEquals(10, new MyCalculator().getSum(2,8));
	}
	@Test
	public void test2() {
		assertEquals(5, new MyCalculator().getSum(2,3));
	}
	@Test
	public void test3() {
		assertEquals(5, new MyCalculator().getDiff(10,5));
	}

	@Test
	public void test4() {
		assertEquals(0, new MyCalculator().getDiff(5,5));
	}


}
