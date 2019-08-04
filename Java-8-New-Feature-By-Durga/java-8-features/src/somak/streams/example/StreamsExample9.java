package somak.streams.example;

import java.util.stream.Stream;

public class StreamsExample9 {

	public static void main(String[] args) {
		System.out.println("print for a group of values using streams");
		Stream<Integer> s = Stream.of(10, 20, 30, 40, 50);
		s.forEach(System.out::println);

		System.out.println("print values of Integer array using streams");
		Integer[] a = { 5, 34, 25, 78, 60 };
		Stream.of(a).forEach(System.out::println);

	}

}
