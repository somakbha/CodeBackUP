package somak.streams.example;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample2 {

	public static void main(String[] args) {
		ArrayList<Integer>marks=new ArrayList<Integer>();
		marks.add(0);
		marks.add(5);
		marks.add(10);
		marks.add(15);
		marks.add(20);
		marks.add(25);
		marks.add(30);

		System.out.println("Complete list of marks, before adding 5 marks to each:"+marks);
		List<Integer>updateMarks=marks.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println("after adding 5 marks:"+updateMarks);
	}

}
