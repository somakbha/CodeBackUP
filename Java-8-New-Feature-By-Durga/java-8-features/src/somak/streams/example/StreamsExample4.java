package somak.streams.example;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample4 {

	public static void main(String[] args) {
		ArrayList<Integer>marks=new ArrayList<Integer>();
		marks.add(70);
		marks.add(45);
		marks.add(10);
		marks.add(65);
		marks.add(20);
		marks.add(25);
				
		List<Integer> l1=marks.stream().sorted().collect(Collectors.toList());
		System.out.println("sorted list by natural sorting order= "+l1);
		
		
		Comparator<Integer>c=(obj1,obj2)->(obj1<obj2)?1:(obj1>obj2)?-1:0;
		List<Integer> l2=marks.stream().sorted(c).collect(Collectors.toList());
		System.out.println("sorted list by descendingl sorting order= "+l2);
		
	}

}
