package org.somak.parallel.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.somak.parallel.streams.pojo.Student;

public class ParallelStreamsExample {

	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();

		list.add(new Student("PK", 23));
		list.add(new Student("KK", 26));
		list.add(new Student("MK", 23));
		list.add(new Student("SK", 21));
		list.add(new Student("RK", 40));
		list.add(new Student("BK", 30));

		Stream<Student> parallelStream1 = list.parallelStream();
		Stream<Student> parallelStream2 = list.parallelStream();
		System.out.println("Students data send for processing:::");
		
		
		System.out.println("------paralllel streams with no ordering guranteed------");
		//No ordering guaranteed
		parallelStream1.forEach(s -> doProcess(s));
		
		
		System.out.println("------paralllel streams with ordering guranteed------");
		//Order guaranteed		
		parallelStream2.forEachOrdered(s -> doProcess(s));

	}

	private static void doProcess(Student s) {
		System.out.println(s);
	}
}
