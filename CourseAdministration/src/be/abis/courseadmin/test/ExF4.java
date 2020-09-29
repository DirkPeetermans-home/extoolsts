package be.abis.courseadmin.test;

import java.io.IOException;

import be.abis.courseadmin.model.Course;
import be.abis.courseadmin.model.Instructor;

public class ExF4 {

	public static void main(String[] args) {
	
		
		//Course[] courses = { co1, co2, co3 };
		//Course[] courses = new Course[] { co1, co2, co3 };
		

		try {
			
			Instructor i1 = new Instructor("Sandy","Schillebeeckx",42,23,2000.0);
			i1.printSalaryHistory();
			
			Instructor i2 = new Instructor("Dirk","Peetermans",52,20,2000.5);
			i2.printSalaryHistory();
			
			Course c1 = new Course("Oracle",5,1000.5,false);
			
			c1.addInstructor(i1);
			c1.addInstructor(i2);
			double totalPrice = c1.calculatePrice();
			c1.printInfo();
			
			//i1.printInstructorData();
			System.out.println(i1);
			
			
		}

		catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}