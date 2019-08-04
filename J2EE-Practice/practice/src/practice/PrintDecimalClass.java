package practice;

public class PrintDecimalClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		prtDec(3, "");

	}
	
	public static void prtDec(int digits, String prefix)
	{
		if (digits==0)
		{
			
			System.out.println(prefix);
			return;
		}
		else {
		prtDec(digits-1, prefix+"0");
		prtDec(digits-1, prefix+"1");
		prtDec(digits-1, prefix+"2");
		prtDec(digits-1, prefix+"3");
		prtDec(digits-1, prefix+"4");
		prtDec(digits-1, prefix+"5");
		prtDec(digits-1, prefix+"6");
		prtDec(digits-1, prefix+"7");
		prtDec(digits-1, prefix+"8");
		prtDec(digits-1, prefix+"9");
		}
		
	}

}
