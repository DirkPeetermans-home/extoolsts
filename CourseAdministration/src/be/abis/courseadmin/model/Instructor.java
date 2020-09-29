package be.abis.courseadmin.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.io.*;

public class Instructor {
	
	private String firstName;
	private String lastName;
	private int age;
	private int ageWhenStarted;
	private double startingSalary;
	
	//Constructor
	public Instructor (String firstName, String lastName, int age, int ageWhenStarted, double startingSalary) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.age=age;
		this.ageWhenStarted=ageWhenStarted;
		this.startingSalary=startingSalary;
	}
	
	//getter
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getAgeWhenStarted() {
		return ageWhenStarted;
	}
	
	public double getStartingSalary() {
		return startingSalary;
	}
	
	//setter
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	
	public void setAge(int age) {
		this.age=age;
	}
	
	public void setAgeWhenStarted(int ageWhenStarted) {
		this.ageWhenStarted=ageWhenStarted;
	}
	
	public void setStartingSalary(int startingSalary) {
		this.startingSalary=startingSalary;
	}
	
				
			
		public void printSalaryHistory() throws IOException {
			
			
				BufferedWriter bw = null;
				File file = new File("Salaryhistory.txt");
				
				if (!file.exists()) {
					file.createNewFile();
				}
				
				FileWriter fw = new FileWriter(file);
				bw = new BufferedWriter(fw);
				
				for ( int i=ageWhenStarted; i<ageWhenStarted +35 ; i +=5) {
					
					if (i > age) {
						break;
					}
					
					bw.write("Salary of " + firstName + " at " + i + " is " + startingSalary + "\n\r");
					startingSalary *= 1.03;
				}
				bw.write("Maximum salary reached");
				bw.close();
								
		}
		
	}
