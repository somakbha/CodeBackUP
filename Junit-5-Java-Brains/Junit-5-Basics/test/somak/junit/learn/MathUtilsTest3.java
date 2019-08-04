package somak.junit.learn;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;


@DisplayName("When running MathUtils ")
class MathUtilsTest3 {

	MathUtils mathUtils;

	@BeforeEach
	void initialized() {
		mathUtils = new MathUtils();
	}

	@Nested
	@DisplayName("add method ")
	class AddTest {

	@Test
	@DisplayName("when adding two positive numbers")
	void testAddPostiveNaumber() {
		// The last parameter in assertEquals() method is a descriptive string
		assertEquals(300, mathUtils.add(100, 200), "should return the correct sum");

	}

	@Test
	@DisplayName("when adding two negative numbers")
	void testAddNegativeNaumber() {
		// The last parameter in assertEquals() method is a descriptive string
		assertEquals(-30, mathUtils.add(-10, -20), "should return the correct sum");

	}

	}

	@Test
	void testMultiply() {

		int expected = 8;
		int actual = mathUtils.multiply(4, 2);

		// The last parameter in assertEquals() method is a descriptive string
		assertEquals(expected, actual, "The multiply method should return product of two numbers");
	}

	@Test
	void testDivide() {

		// The second parameter is a lambda expression, to create Executable
		assertThrows(ArithmeticException.class, () -> mathUtils.division(5, 0));

	}

}
