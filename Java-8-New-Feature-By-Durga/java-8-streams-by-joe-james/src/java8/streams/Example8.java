package java8.streams;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Example8 {
	public static void main(String[] args) throws IOException {
		// 8. Stream rows from text file, sort, filter, and print
				Stream<String> bands = Files.lines(Paths.get("/home/somak/somak/Java-8-New-Feature-By-Durga/java-8-streams-by-joe-james/data/bands.txt"));
				bands
					.sorted()
					.filter(x -> x.length() > 13)
					.forEach(System.out::println);
				bands.close();

		
	}
}