package somak.junit.learn;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MathUtilsTest2 {

	MathUtils mathUtils;

	@BeforeEach
	void initialized() {
		mathUtils = new MathUtils();
	}

	@Test
	@DisplayName("Multiply Method")
	void testMultiply() {
	
		//if any of this fails then test will fail
		assertAll(
				() -> assertEquals(8, mathUtils.multiply(4, 2)),
				() -> assertEquals(10, mathUtils.multiply(5, 2)),
				() -> assertEquals(12, mathUtils.multiply(6, 2)),
				() -> assertEquals(14, mathUtils.multiply(7, 2)),
				() -> assertEquals(16, mathUtils.multiply(8, 2)),
				() -> assertEquals(18, mathUtils.multiply(9, 2)),
				() -> assertEquals(2, mathUtils.multiply(-2, -1))				
				);
	}

}