package somak.streams.example;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsExample5 {

	public static void main(String[] args) {
		ArrayList<String>names=new ArrayList<String>();
		names.add("Somak Bhattacharya");
		names.add("Saptak Bhattacharya");
		names.add("Piyali Bhattacharya");
		names.add("Somenath Bhattacharya");
		names.add("Krishna Bhattacharya");
		names.add("Rupak Bhattacharya");
		names.add("Saptak Bhattacharya");
				
				
		
		Comparator<String> increasingLength=(obj1,obj2)->(obj1.length()<obj2.length())?-1:(obj1.length()>obj2.length())?1:obj1.compareTo(obj2);
		//Comparator<String> increasingLength=(obj1,obj2)->(obj1.length()<obj2.length())?-1:(obj1.length()>obj2.length())?1:0;
		List<String> l2=names.stream().sorted(increasingLength).collect(Collectors.toList());
		System.out.println("sorted list increasing length of order= "+l2);
		
	}

}
