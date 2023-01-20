package users;

import enums.Gender;

public abstract class Employee extends User{
	int salary; 
	String id;

	public Employee(String firstName, String lastname, String login, String password, Gender gender, int salary,
			String id) {
		super(firstName, lastname, login, password, gender);
		this.salary = salary;
		this.id = id;
	} 
}
