package org.somak.lambda.uni1;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.somak.lambda.inter.Condition;
import org.somak.lambda.pojo.Person;

public class UnitExcercise {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Charles", "Dickens", 60),
				new Person("Lewis", "Carroll", 42),
				new Person("Thomas", "Carlyle", 51),
				new Person("Charlotte", "Bronte", 45),
				new Person("Matthew", "Arnold", 39)
				);
		
		// Step 1: Sort list by last name
		
				
		Comparator<Person> c=(obj1, obj2)->obj1.getLastName().compareTo(obj2.getLastName());
		Collections.sort(people, c);
		
		
		// Step 2: Create a method that prints all elements in the list
		
		
		Condition c1=p->true;
		printListConditionally(people, c1);
		
		System.out.println("*******************************");
		
		// Step 3: Create a method that prints all people that have last name beginning with C 
		
		Condition c2=p->p.getLastName().startsWith("C");
		printListConditionally(people, c2);

	}
	
	public static void printListConditionally(List<Person> l, Condition c)
	{
     
			for(Person p1:l)
			{
				if(c.test(p1))
				System.out.println(p1);
			}
			
		
		
	}
	
	

}
