package org.somak.map.flatmap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMap {

	public static void main(String[] args) {
		List<String>words1=Arrays.asList("JavaDevJournal", "Java", "Spring Boot", "Java8");
		List<Integer>wordsLength=words1.stream().map(s->s.length()).collect(Collectors.toList());
		wordsLength.forEach(System.out::println);
		
		List<String>words2=Arrays.asList("JavaDevJournal", "Java");
		
		
		//Incorrect way of getting distinct letters from a list
		List<String[]> l2=words2.stream().map(s->s.split("")).distinct().collect(Collectors.toList());

		l2.forEach(System.out::println);
		
		
		//Proper way of getting distinct letters from a list
		List<String> l3=words2.stream().map(s->s.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList());

		l3.forEach(System.out::print);
	}

}