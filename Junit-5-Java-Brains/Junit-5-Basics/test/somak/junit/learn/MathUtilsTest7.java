package somak.junit.learn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class MathUtilsTest7 {

	MathUtils mathUtils;

	@BeforeEach
	void initialized() {
		mathUtils = new MathUtils();
	}

	@Test
	@DisplayName("test add method")
	@Tag("Math")
	void testAdd() {

		// int expected=500;
		int expected = 300;
		int actual = mathUtils.add(100, 200);

		// The last parameter in assertEquals() method is a descriptive string
		assertEquals(expected, actual, "The add method should add two numbers");

	}

	// import org.junit.jupiter.api.condition.EnabledOnOs;
	@Test
	@Tag("Math")
	void testMultiply() {

		int expected = 8;
		int actual = mathUtils.multiply(4, 2);

		// The last parameter in assertEquals() method is a descriptive string
		assertEquals(expected, actual, "The multiply method should return product of two numbers");
	}

	@Test
	@Tag("Math")
	void testDivide() {

		// The second parameter is a lambda expression, to create Executable
		assertThrows(ArithmeticException.class, () -> mathUtils.division(5, 0));

	}

	@Test
	@Tag("ComputeArea")
	void testComputeCircle() {
		assertEquals(314.1592653589793, mathUtils.testComputeCircle(10), "the method should return right area value");
	}

	@Test
	@Disabled
	@DisplayName("Test driven developement method. Should not be run")
	void testDisabled() {
		fail("This method should fail");
	}

}
