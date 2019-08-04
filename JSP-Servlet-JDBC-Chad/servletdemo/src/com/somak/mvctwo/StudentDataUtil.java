package com.somak.mvctwo;

import java.util.ArrayList;
import java.util.List;

public class StudentDataUtil {
	
	public static List<Student> getStudents() {

		
		//create an empty list
		
		List <Student>students=new ArrayList<>();
		//add sample data
		students.add(new Student("raj", "roy","abc@gmail.com"));
		students.add(new Student("bob", "das","def@rediff.com"));
		students.add(new Student("ron", "dey","ijk@yahoo.com"));
		
		//return the list
		
		return students;
	}

}
