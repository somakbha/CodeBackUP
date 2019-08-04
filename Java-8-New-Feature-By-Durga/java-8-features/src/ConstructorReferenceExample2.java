class SampleWithArg
{
	SampleWithArg()
	{
		System.out.println("no-arg constrictor executed");
	}
	
	SampleWithArg(String s)
	{
		System.out.println("string-arg constrictor executed with value: "+s);
	}
}

//functional interface which returns an Object of class Sample
interface SampleWithArgI
{
	public SampleWithArg get(String s);
}
public class ConstructorReferenceExample2 {

	public static void main(String[] args) {
		
		SampleWithArgI s2=SampleWithArg::new;
		s2.get("somak bhattacharya");
	}

}
