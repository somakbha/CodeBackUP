import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Employee
{
	String ename;
	int eno;
	
	Employee(String ename, int eno)
	{
		this.ename=ename;
		this.eno=eno;
	}
	
	public String toString()
	{
		return eno+":"+ename;
	}
}
public class SortEmployeeObjectUsingLambdaExpression {
	
	public static void main(String args[]) {
	ArrayList<Employee>l1=new ArrayList<Employee>();
	
	l1. add(new Employee("somak", 12345));
	l1. add(new Employee("rupak", 45678));
	l1. add(new Employee("saptak", 98765));
	l1. add(new Employee("piyali", 34521));
	
	System.out.println("Before Sorting:"+l1);
	Comparator<Employee> c=(e1,e2)->(e1.eno<e2.eno)?-1:(e1.eno>e2.eno)?1:0;
	Collections.sort(l1, c);
	System.out.println("After Sorting by employee number ascending order:"+l1);
	
	
    ArrayList<Employee>l2=new ArrayList<Employee>();
	
	l2. add(new Employee("somak", 12345));
	l2. add(new Employee("rupak", 45678));
	l2. add(new Employee("saptak", 98765));
	l2. add(new Employee("piyali", 34521));
	
	System.out.println("Before Sorting:"+l2);
	Comparator<Employee> c1=(e1,e2)->(e1.ename.compareTo(e2.ename));
	Collections.sort(l2, c1);
	System.out.println("After Sorting by employee name alphabetical ascending order:"+l2);
	
	
	
	}
	


}
