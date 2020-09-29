package be.abis.ExA6.model;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Person {

	private int personNumber;
	private String firstName;
	private String lastName;
	private LocalDate birthDate;	
	private Company company;
	
	public Person(int personNumber, String firstName, String lastName, LocalDate birthDate) {
		super();
		this.personNumber = personNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
			}
	
	public Person(int personNumber, String firstName, String lastName, LocalDate birthDate, Company company) {
		super();
		this.personNumber = personNumber;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDate = birthDate;
		this.company = company;
	}

	public int getPersonNumber() {
		return personNumber;
	}

	public void setPersonNumber(int personNumber) {
		this.personNumber = personNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
	public String toString() {
		String output;
		if (this.company == null) {
			output="Person " + this.personNumber + " : " + this.firstName + " " + this.lastName + " (" + this.calculateAge() + " years old)" + " is not employed for the moment";
		} else {
			output="Person " + this.personNumber + " : " + this.firstName + " " + this.lastName + " (" + this.calculateAge() + " years old)" + " works for " + this.company.getName() + " in " +this.company.getAdress().getTown();
		}
		return output ;
	}

	public int calculateAge() {
		return Period.between(birthDate, LocalDate.now()).getYears();
	}
	
}
