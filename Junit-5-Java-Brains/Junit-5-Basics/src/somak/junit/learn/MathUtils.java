package somak.junit.learn;

public class MathUtils {
	
	public int add(int a, int b)
	{
		return a+b;
	}
	
	public int subtract(int a, int b)
	{
		return a-b;
	}
	
	public int multiply(int a, int b)
	{
		return a*b;
	}
	
	public int division(int a, int b)
	{
		return a/b;
	}

	public double testComputeCircle(int radius)
	{
		return Math.PI*radius*radius;
	}
}