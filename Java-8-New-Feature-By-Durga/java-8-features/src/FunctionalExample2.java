import java.util.ArrayList;
import java.util.function.Function;

class Students{
	
	String name;
	int marks;
	
	public Students(String name, int marks) {
		super();
		this.name = name;
		this.marks = marks;
	}
	
}


public class FunctionalExample2 {
	
	
	

	public static void main(String[] args) {
		
		Function<Students, String>findStudentGrade=s->{
			
			if (s.marks>=90)
				return "A";
			else if (s.marks>=80)
				return "B";
			else if (s.marks>=70)
				return "C";
			else if (s.marks>=60)
				return "D";
			else if (s.marks>=50)
				return "E";
			else if (s.marks>=40)
				return "A";
			else
				return "F";
		};
		
		ArrayList <Students> list=new ArrayList<Students>();
		list.add(new Students("raj", 100));
		list.add(new Students("ron", 85));
		list.add(new Students("joy", 75));
		list.add(new Students("bob", 65));
		list.add(new Students("chris", 55));
		list.add(new Students("jon", 45));
		list.add(new Students("martin", 35));
		
		for (Students s1: list)
		{
			System.out.println(s1.name);
			System.out.println(s1.marks);
			System.out.println(findStudentGrade.apply(s1));
			System.out.println();
		}

	}

}
