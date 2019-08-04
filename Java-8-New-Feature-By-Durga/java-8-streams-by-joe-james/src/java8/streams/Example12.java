package java8.streams;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Example12 {
	public static void main(String[] args) throws IOException {
		// 12. Stream rows from CSV file, store fields in HashMap
				Stream<String> rows3 = Files.lines(Paths.get("/home/somak/somak/Java-8-New-Feature-By-Durga/java-8-streams-by-joe-james/data/data.txt"));
				Map<String, Integer> map = new HashMap<>();
				map = rows3
					.map(x -> x.split(","))
		            .filter(x -> x.length == 3)
					.filter(x -> Integer.parseInt(x[1]) > 15)
					.collect(Collectors.toMap(
		                x -> x[0],
		                x -> Integer.parseInt(x[1])));
				rows3.close();
				map.forEach((k,v)->System.out.println("key:"+k+" value:"+v));
				for (String key : map.keySet()) {
					System.out.println(key + "  " + map.get(key));
				}
	}
}