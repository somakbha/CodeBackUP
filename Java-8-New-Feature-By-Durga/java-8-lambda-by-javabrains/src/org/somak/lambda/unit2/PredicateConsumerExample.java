package org.somak.lambda.unit2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import org.somak.lambda.pojo.Person;

public class PredicateConsumerExample {

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
		
		
		Predicate <Person>pred1=p->true;
		printListConditionally(people, pred1, p->System.out.println(p));
		
		System.out.println("*******************************");
		
		// Step 3: Create a method that prints all people that have last name beginning with C 
		
		Predicate <Person>pred2=p->p.getLastName().startsWith("C");
		printListConditionally(people, pred2, p->System.out.println(p));

	}
	
	public static void printListConditionally(List<Person> l, Predicate <Person>p, Consumer <Person>consm)
	{
     
			for(Person p1:l)
			{
				if(p.test(p1))
				consm.accept(p1);
			}
			
		
		
	}
	
	

}