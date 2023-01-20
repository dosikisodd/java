package users;

import java.util.Vector;

import Interfaces.CanViewCourses;
import classes.Course;
import enums.Faculty;
import enums.Gender;

public class Student extends User implements CanViewCourses {
	private int year;
	private Faculty faculty;
	private String id;
	private float gpa;
	private Vector<Course> courses = new Vector<>();

	public Student(String firstName, String lastname, String login, String password, Gender gender, int year, Faculty faculty, String id) {
		super(firstName, lastname, login, password, gender);
		this.year = year;
		this.faculty = faculty;
		this.id = id;
		gpa = 0;
	}

	public int getYear() {
		return year;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public String getId() {
		return id;
	}

	public float getGpa() {
		return gpa;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setGpa(float gpa) {
		this.gpa = gpa;
	}
	public Vector<Course> getCourses() {
		return courses;
	}
	@Override
	public String toString() {
		return "Student [firstName=" + getFirstName() + ", lastname=" + getLastname() + ", login=" + getLogin() + ", password=" + getPassword()
		+ ", gender=" + getGender() + ", year=" + year + ", faculty=" + faculty + ", id=" + id + ", gpa=" + gpa + "]";
	}

	@Override
	public void viewCourses() {
		for(int i = 0; i < courses.size(); i++) {
			System.out.println((i + 1) + ") " + courses.get(i));
		}
	}
}
