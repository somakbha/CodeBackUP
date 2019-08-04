package java8.streams;
import java.io.IOException;
import java.util.stream.Stream;

public class Example4 {
	public static void main(String[] args) throws IOException {
		// 4. Stream.of, sorted and findFirst
				Stream.of("Ava", "Aneri", "Alberto")
					.sorted()
					.findFirst()
					.ifPresent(System.out::println);
		
	}
}