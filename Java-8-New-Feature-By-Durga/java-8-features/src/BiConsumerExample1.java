import java.util.ArrayList;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;

class Employee2
{
	String name;
	int eno;
	double salary;
	
	public Employee2(String name, int eno, double salary) {
		super();
		this.name = name;
		this.eno = eno;
		this.salary=salary;
	}
	
	
}



public class BiConsumerExample1 {

	public static void main(String[] args) {
		
		ArrayList<Employee2> list=new ArrayList<Employee2>();
		
		list.add(new Employee2("raj",123,1000.00));
		list.add(new Employee2("ravi",456,2000.00));
		list.add(new Employee2("ron",789,5000.00));
		list.add(new Employee2("tm",103,3000.00));
		list.add(new Employee2("jon",362,7000.00));
		
		//Increase salary by 500/ for all employee
		BiConsumer<Employee2,Double> salaryIncrementSupplier=(e2,salaryIncrementValue)->e2.salary=e2.salary+salaryIncrementValue;
		
		
		for (Employee2 e:list)
		{
			System.out.println(e.name);
			System.out.println(e.eno);
			System.out.println("previous salary:"+e.salary);
			salaryIncrementSupplier.accept(e,500.00);
			System.out.println("updated salary:"+e.salary);
			System.out.println("--------------------------------");
		}
	}

}
