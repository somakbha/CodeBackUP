package somak.junit.learn;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MathUtilsTest5 {

	MathUtils mathUtils;

	@BeforeEach
	void initializer() {
		mathUtils = new MathUtils();
	}

	@Test
	void testSubtract() {

		// The last parameter in assertEquals() method is a descriptive string
		//Passing here a lambda expression instead of string for lazy assert messages
		assertEquals(1, mathUtils.subtract(5, 2), ()->"The subtract method should return subtract of two numbers");
	}

}
