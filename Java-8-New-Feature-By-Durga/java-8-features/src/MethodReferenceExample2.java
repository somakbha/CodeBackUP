
interface interf1
{
	public void add(int a, int b);
}



public class MethodReferenceExample2 {
	
	public void sum(int x, int y)
	{
		System.out.println("addition of two numbers "+x+" and "+y+" are:"+(x+y));
	}

	public static void main (String args[])
	{
	interf1 a=(p,q)->System.out.println("addition of two numbers "+p+" and "+q+" are:"+(p+q));
	a.add(5,6);
	
	interf1 b=new MethodReferenceExample2()::sum;
	b.add(10, 20);
	}

}
