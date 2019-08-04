package somak.streams.example;
import java.util.ArrayList;

public class StreamsExample3 {

	public static void main(String[] args) {
		ArrayList<Integer>marks=new ArrayList<Integer>();
		marks.add(70);
		marks.add(45);
		marks.add(10);
		marks.add(65);
		marks.add(20);
		marks.add(25);
				
		long nOfFailedStudents=marks.stream().filter(i->i<=35).count();  //collect(Collectors.toList()).co;
		System.out.println("no. of failed student got marks 35 or less thatn that= "+nOfFailedStudents);
	}

}
