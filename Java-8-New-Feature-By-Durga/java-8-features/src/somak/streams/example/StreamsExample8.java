package somak.streams.example;
import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamsExample8 {

	public static void main(String[] args) {
		ArrayList<Integer>marks=new ArrayList<Integer>();
		marks.add(70);
		marks.add(45);
		marks.add(10);
		marks.add(65);
		marks.add(20);
		marks.add(25);
				
		Integer i[]=marks.stream().toArray(Integer[]::new);
		
		System.out.println("printing elements from array");
		for (Integer i1:i)
		{
			System.out.println(i1);
		}
		
		System.out.println("printing elements from array by first convert an array to streams and then using forEach()");
		Stream.of(i).forEach(System.out::println);
		
		
	}

}
