package practice;

import java.util.ArrayList;

public class PermuteString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>permList=new ArrayList<String>();
		
		permString("MARTY", permList);

	}
	public static void permString(String str, ArrayList<String>permList)
	{
		if (permList.size()==str.length()) {
			System.out.println(permList);
		}
		else
		{
			for (int i=0; i<str.length(); i++) {
			char c= str.charAt(i);
			char[]str1=str.toCharArray();
			permList.add(Character.toString(c));
			permString(str, permList);
			
			permList.remove(permList.size()-1);
			}
		}
		
	}

}
