package somak.junit.learn;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.RepetitionInfo;

class MathUtilsTest6 {

	MathUtils mathUtils;

	@BeforeEach
	void initializer() {
		mathUtils = new MathUtils();
	}

	@RepeatedTest(2)
	void testMultiply() {
		assertEquals(10, mathUtils.multiply(5, 2), () -> "The subtract method should return subtract of two numbers");
	}

	@RepeatedTest(3)
	void testDivide(RepetitionInfo repeatInfo) {

		System.out.println("Total repetition " + repeatInfo.getTotalRepetitions() + " Current repetition "
				+ repeatInfo.getCurrentRepetition());
		if (repeatInfo.getCurrentRepetition() == 1) {
			assertEquals(3, mathUtils.division(6, 2),
					() -> "The subtract method should return subtract of two numbers");
		}

		if (repeatInfo.getCurrentRepetition() == 2) {
			assertEquals(4, mathUtils.division(8, 2),
					() -> "The subtract method should return subtract of two numbers");
		}

		if (repeatInfo.getCurrentRepetition() == 3) {
			assertEquals(5, mathUtils.division(10, 2),
					() -> "The subtract method should return subtract of two numbers");
		}

	}

}