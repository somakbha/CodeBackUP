package java8.streams;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Example11 {
	public static void main(String[] args) throws IOException {
		// 11. Stream rows from CSV file, parse data from rows
				Stream<String> rows2 = Files.lines(Paths.get("/home/somak/somak/Java-8-New-Feature-By-Durga/java-8-streams-by-joe-james/data/data.txt"));
				rows2
					.map(x -> x.split(","))
		            .filter(x -> x.length == 3)
					.filter(x -> Integer.parseInt(x[1]) > 15)
					.forEach(x -> System.out.println(x[0] + "  " + x[1] + "  " + x[2]));
				rows2.close();
	}
}