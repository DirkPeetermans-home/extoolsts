package be.abis.courseadmin.test;

import java.io.IOException;

import be.abis.courseadmin.model.Course;
import be.abis.courseadmin.model.Instructor;

public class ExF4 {

	public static void main(String[] args) {

		Course co1 = new Course("Java", 2, 300.0, false);
		co1.addInstructor("Dirk");
		co1.addInstructor("Chri");
		Course co2 = new Course("Python", 3, 300.0, true);
		co2.addInstructor("Dirk");
		Course co3 = new Course("Cobol", 6, 300.0, false);
		co2.addInstructor("Dirk");
		co2.addInstructor("Tim");
		co3.setTitle("OOCobol");
		
		Instructor i1 = new Instructor("Sandy","Schillebeeckx",42,23,2000.0);
		
		
		//Course[] courses = { co1, co2, co3 };
		Course[] courses = new Course[] { co1, co2, co3 };
		

		try {
			i1.printSalaryHistory();
			for (Course c : courses) {
				System.out.println(c.getTitle() + " costs " + c.calculatePrice());
				c.printInfo();
				
			}
		}

		catch (IOException e) {
			System.out.println(e.getMessage());
		}

	}

}