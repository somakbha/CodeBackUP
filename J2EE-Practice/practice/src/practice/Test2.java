package practice;

class P {

	protected int i;
	protected int j;
	P()
	{
		
	}
	P(int i, int j)
	{
		System.out.println("called parent constructor");
		this.i=i;
		this.j=j;
	}
}

public class Test2 extends P{
	
	private int x;
	private int y;
	Test2(int i, int j, int x, int y)
	{
		super(i,j);
		this.x=x;
		this.y=y;
	}
	
	public static void main (String args[])
	{
		Test2 c= new Test2(10, 20, 30, 40);
		System.out.println(c.i+"----"+c.j);
	}
	
	
}
