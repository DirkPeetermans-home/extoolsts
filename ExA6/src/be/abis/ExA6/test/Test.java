package be.abis.ExA6.test;

import java.time.LocalDate;

import be.abis.ExA6.model.Adress;
import be.abis.ExA6.model.Company;
import be.abis.ExA6.model.Person;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Adress adress1 = new Adress("Broekstraat", "30", "1000", "Brussel", "België", "BE");
		Company company1 = new Company("Fortis", adress1 );
		Person person1 = new Person(1,"Ann","Smits",LocalDate.of(1968, 6, 22),company1);
		Person person2 = new Person(2,"John","Doe",LocalDate.of(1969, 6, 22));
		
		System.out.println(person1);
		System.out.println(person2);
	}

}
