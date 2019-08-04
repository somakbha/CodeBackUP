import java.util.ArrayList;
import java.util.function.Predicate;

class Employees {
	String ename;
	int salary;

	public Employees(String ename, int salary) {
		super();
		this.ename = ename;
		this.salary = salary;
	}

}

public class PredicateExample2 {

	public static void main(String args[]) {

		ArrayList<Employees> l = new ArrayList<Employees>();

		l.add(new Employees("emp1", 1000));
		l.add(new Employees("emp2", 2000));
		l.add(new Employees("emp3", 3000));
		l.add(new Employees("emp4", 4000));
		l.add(new Employees("emp5", 5000));
		l.add(new Employees("emp6", 6000));
		l.add(new Employees("emp7", 7000));

		Predicate<Employees> emp = e -> e.salary > 3000;

		for (Employees e : l) {
			if (emp.test(e)) {
				System.out.println(e.ename + ":" + e.salary);
			}
		}

	}

}
