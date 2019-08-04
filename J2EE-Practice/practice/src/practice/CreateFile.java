package practice;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {

	public static void main(String[] args) throws IOException {
		/*File f1 =new File ("abc.txt");
		f1.createNewFile();
		System.out.println (f1.exists());
		File f =new File ("/home/somak/somak");
		
		String s[]=f.list();
		for (String s1: s) {
		System.out.println(s1);
		}
		
		System.out.println(f1.length());*/
		
		char ch1[]= {'a', 100};
		FileWriter f2=new FileWriter("test.txt",false);
		f2.write(ch1);
		f2.close();
		
		/*FileReader f3=new FileReader("abc.txt");
		
		int i =f3.read();
		while (i!=-1)
		{
			//System.out.println (i);
			System.out.print ((char)i);
			i =f3.read();

			
		}*/
		

	}

}
