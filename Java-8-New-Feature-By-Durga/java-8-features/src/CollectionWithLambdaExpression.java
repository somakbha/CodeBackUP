import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyComparator implements Comparator<Integer>{

	@Override
	public int compare(Integer I1, Integer I2) {
		
		return (I1<I2)?-1:(I1>I2)?1:0;
	}
	
}
public class CollectionWithLambdaExpression {
	
	public static void main(String args[]) {
	ArrayList<Integer>l1=new ArrayList<Integer>();
	
	l1.add(20);
	l1.add(25);
	l1.add(10);
	
	System.out.println("BEFORE: Soring using traditional way for array: "+l1);
	Collections.sort(l1,new MyComparator());
	System.out.println("AFTER: Soring using traditional way for array: "+l1);
	
	
    ArrayList<Integer>l2=new ArrayList<Integer>();
	
	l2.add(30);
	l2.add(45);
	l2.add(8);
	
	Comparator <Integer>c=(I1,I2)->(I1<I2)?-1:(I1>I2)?1:0;
	
	System.out.println("BEFORE: Soring using lambda expression for array: "+l2);
	Collections.sort(l2, c);
	System.out.println("AFTER: Soring using lambda expression for array: "+l2);
}
}
