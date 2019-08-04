package somak.junit.learn;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;


//@TestInstance(TestInstance.Lifecycle.PER_CLASS)
//@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class MathUtilsTest {

	MathUtils mathUtils;

	@BeforeAll
	static void beforeAllInitialization()
	{
		System.out.println("This needs to run before all");
	}
	
	@AfterAll
	 static void afterllInitialization()
	{
		System.out.println("This needs to run after all");
	}
	
	
	@BeforeEach
	void initialized() {
		mathUtils = new MathUtils();
	}
	
	@AfterEach
	void cleanUP() {
		System.out.println("cleaning up");
	}

	@Test
	@DisplayName("test add method")
	void testAdd() {

		// int expected=500;
		int expected = 300;
		int actual = mathUtils.add(100, 200);

		// The last parameter in assertEquals() method is a descriptive string
		assertEquals(expected, actual, "The add method should add two numbers");
		// assertEquals(expected, actual);
		// fail("Not yet implemented");
		// System.out.println("This test ran");
	}
//	import org.junit.jupiter.api.condition.EnabledOnOs;
	@Test
	void testMultiply() {

		boolean isServerUp=false;
		assumeTrue(isServerUp);
		int expected = 8;
		int actual = mathUtils.multiply(4, 2);

		// The last parameter in assertEquals() method is a descriptive string
		assertEquals(expected, actual, "The multiply method should return product of two numbers");
	}

	@Test
	void testDivide() {

		// The second parameter is a lambda expression, to create Executable
		assertThrows(ArithmeticException.class, () -> mathUtils.division(5, 0));

		// This will fail as the return type ArithmeticException
		// assertThrows(NullPointerException.class, () -> mathUtils.division(5, 0));

		// This will pass as the Exception is a superclass of ArithmeticException
		//assertThrows(Exception.class, () -> mathUtils.division(5, 0));
	}

	@Test
	void testComputeCircle() {
		assertEquals(314.1592653589793, mathUtils.testComputeCircle(10), "the method should return right area value");
	}
	
	@Test
	@Disabled
	@DisplayName ("Test driven developement method. Should not be run")
	void testDisabled() {
		fail("This method should fail");
	}

}