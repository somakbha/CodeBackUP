package org.somak.parallel.streams;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.somak.parallel.streams.pojo.Student;


public class DifferentWaysOfCreateStreams {
	
			public static void main(String[] args) {

		    System.out.println("----Creating streams using Arrays.stream() method----");
			String arr[]=new String[] {"AA","BB","CC"};
			Stream<String> stream=Arrays.stream(arr);
			stream.forEach(System.out::println);
			
			System.out.println("----Creating streams using Stream.of() method----");
			
			Stream<String> of=Stream.of("A","B","C","D");
			of.forEach(System.out::println);
			
			System.out.println("----Creating streams using list.stream() method----");
			List<String> list  = new ArrayList<String>();
			list.add("Kishan");
			list.add("Raj");
			list.add("Kishan");
			
			Stream<String> stream2=list.stream();
			stream2.forEach(System.out::println);
			
			
	
		}

		
	}

