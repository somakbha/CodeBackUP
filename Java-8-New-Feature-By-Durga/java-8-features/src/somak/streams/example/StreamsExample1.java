package somak.streams.example;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample1 {

	public static void main(String[] args) {
		ArrayList<Integer>l=new ArrayList<Integer>();
		l.add(0);
		l.add(5);
		l.add(10);
		l.add(15);
		l.add(20);
		l.add(25);
		l.add(30);

		System.out.println("Complete list of numbers:"+l);
		List<Integer>l2=l.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println("Even list of numbers:"+l2);
	}

}
