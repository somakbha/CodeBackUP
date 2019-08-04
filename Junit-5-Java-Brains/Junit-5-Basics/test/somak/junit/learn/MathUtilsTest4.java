package somak.junit.learn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

class MathUtilsTest4 {

	MathUtils mathUtils;
	
	@BeforeEach
	void initializer()
	{
		mathUtils=new MathUtils();
	}

	@Test
	void testMultiply() {

		//if we make isServerUp as false the test will be skipped
		boolean isServerUp = true;
		//boolean isServerUp = false;
		assumeTrue(isServerUp);
		int expected = 8;
		int actual = mathUtils.multiply(4, 2);

		// The last parameter in assertEquals() method is a descriptive string
		assertEquals(expected, actual, "The multiply method should return product of two numbers");
	}

	@Test
	@EnabledOnOs(OS.LINUX)
	//@EnabledOnOs(OS.WINDOWS)
	//if we make OS as something else in the above annotation the test will be skipped
	void testDivide() {

		assertEquals(3, mathUtils.division(6, 2), "The divide method should return division of two numbers");
		

	}

}