import java.util.function.BiFunction;

class Employee1
{
	String name;
	int eno;
	
	public Employee1(String name, int eno) {
		super();
		this.name = name;
		this.eno = eno;
	}
	
	
}



public class BiFunctionExample1 {

	public static void main(String[] args) {
		
		BiFunction<String,Integer,Employee1> bf=(ename,eno)->new Employee1(ename,eno);
		
		Employee1 e1=bf.apply("somak", 123456);
		System.out.println ("new Employye object provided by BiFunction with values: "+e1.eno+" : "+e1.name);
		
		Employee1 e2=bf.apply("rupak", 987654);
		System.out.println ("new Employye object provided by BiFunction with values: "+e2.eno+" : "+e2.name);


	}

}
