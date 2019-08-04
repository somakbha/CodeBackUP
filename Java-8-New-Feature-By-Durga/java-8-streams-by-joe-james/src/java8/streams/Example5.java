package java8.streams;
import java.io.IOException;
import java.util.Arrays;

public class Example5 {
	public static void main(String[] args) throws IOException {
		// 5. Stream from Array, sort, filter and print
				String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah"};
				Arrays.stream(names)	// same as Stream.of(names)
					.filter(x -> x.startsWith("S"))
					.sorted()
					.forEach(System.out::println);
	}
}