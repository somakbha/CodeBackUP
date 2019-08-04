package practice;

public class PrintBinaryClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		prtBin(3, "");

	}
	
	public static void prtBin(int digits, String prefix)
	{
		if (digits==0)
		{
			System.out.println(prefix);
			return;
		}
		else {
		prtBin(digits-1, prefix+"0");
		prtBin(digits-1, prefix+"1");
		}
		
	}

}
