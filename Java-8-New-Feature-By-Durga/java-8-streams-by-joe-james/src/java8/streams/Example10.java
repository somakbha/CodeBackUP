package java8.streams;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Example10 {
	public static void main(String[] args) throws IOException {
		// 10. Stream rows from CSV file and count
				Stream<String> rows1 = Files.lines(Paths.get("/home/somak/somak/Java-8-New-Feature-By-Durga/java-8-streams-by-joe-james/data/data.txt"));
				int rowCount = (int)rows1
					.map(x -> x.split(","))
		            .filter(x -> x.length == 3)
					.count();
				System.out.println(rowCount + " rows.");
				rows1.close();
	}
}