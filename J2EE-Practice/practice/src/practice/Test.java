package practice;

public class Test {
	
	int i;
	
	Test(int i)
	{
		this.i=i;
	}
	
	
	
	public static void main (String args[])
	{
		String s0="DURGA";
		String s1="durga";
		String s2=s1.toString();
		
		String s4=s1.toUpperCase();
		String s5=s4.intern();
		
		System.out.println(s0==s4);
		System.out.println(s0==s5);
	}

}
