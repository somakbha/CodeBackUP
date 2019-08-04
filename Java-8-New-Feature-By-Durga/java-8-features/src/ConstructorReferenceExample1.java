class Sample
{
	Sample()
	{
		System.out.println("no-arg constrictor executed");
	}
	
	Sample(String s)
	{
		System.out.println("string-arg constrictor executed with value: "+s);
	}
}

//functional interface which returns an Object of class Sample
interface sampleI
{
	public Sample get();
}
public class ConstructorReferenceExample1 {

	public static void main(String[] args) {
		
		sampleI s1=Sample::new;
		s1.get();
	}

}
