package somak.streams.example;
import java.util.ArrayList;

public class StreamsExample6 {

	public static void main(String[] args) {
		ArrayList<Integer>marks=new ArrayList<Integer>();
		marks.add(70);
		marks.add(45);
		marks.add(10);
		marks.add(65);
		marks.add(20);
		marks.add(25);
				
		Integer min=marks.stream().min((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("minimum value as per ascending order or natural sorting order:"+min);
		
		Integer max=marks.stream().max((i1,i2)->i1.compareTo(i2)).get();
		System.out.println("maximum value as per ascending order or natural sorting order:"+max);
		
		
		
		Integer min1=marks.stream().min((i1,i2)->-i1.compareTo(i2)).get();
		System.out.println("minimum value as per descending order:"+min1);
		
		Integer max1=marks.stream().max((i1,i2)->-i1.compareTo(i2)).get();
		System.out.println("maximum value as per descending order:"+max1);
		
		
		
	}

}
