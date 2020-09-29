
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
import java.io.*;

public class ExG1 {
				
	public static void main(String[] args) {
		
		Scanner myInput = new Scanner(System.in);
		boolean ageOK = false;
		int age = 0;
		int ageWhenStarted = 20;
		double startingSalary = 2000;
		
		System.out.println("Enter first name : ");		
		String firstName = myInput.nextLine();
		
		System.out.println("Last name : ");		
		String lastName = myInput.nextLine();
		
		while (!ageOK) {
		try {
			System.out.println("Age : ");
			age = Integer.parseInt(myInput.nextLine());
			ageOK = true;
		} catch (NumberFormatException e) {
			System.out.println("Please enter a numeric value here");	
			}	
		}
		
		//printSalaryHistory(age, ageWhenStarted, startingSalary, firstName, lastName);
		printSalaryHistory(age, ageWhenStarted, startingSalary, firstName, lastName, "Salaryhistory2.txt");
		
	}
	
		private static void printSalaryHistory( int age, int ageWhenStarted, double startingSalary, String firstName, String lastName) {
			
			try {
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

			
			} catch (IOException ioe) {
				System.out.println("FileError : " + ioe);
			}
			
					
		}
		
		private static void printSalaryHistory( int age, int ageWhenStarted, double startingSalary, String firstName, String lastName, String outputFile) {
			
			try {
				BufferedWriter bw = null;
				File file = new File(outputFile);
				
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

			
			} catch (IOException ioe) {
				System.out.println("FileError : " + ioe);
			}
			
					
		}
		
	}
