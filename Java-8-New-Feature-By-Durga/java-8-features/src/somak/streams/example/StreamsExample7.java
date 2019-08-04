package somak.streams.example;
import java.util.ArrayList;
import java.util.function.Consumer;

public class StreamsExample7 {

	public static void main(String[] args) {
		ArrayList<Integer>marks=new ArrayList<Integer>();
		marks.add(70);
		marks.add(45);
		marks.add(10);
		marks.add(65);
		marks.add(20);
		marks.add(25);
				
		marks.stream().forEach(System.out::println);
		
		Consumer<Integer> f=i->{System.out.println("Square of "+i+" is:"+(i*i));};
		
		marks.stream().forEach(f);
	}

}
