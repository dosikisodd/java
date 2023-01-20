package users;

import java.util.Vector;

import classes.Course;
import enums.Faculty;
import enums.Gender;
import enums.TeacherTitle;

public class Teacher extends Employee {
	private Faculty faculty;
	private TeacherTitle title;
	private float rating;
	Vector<Course> teaches = new Vector<>();
	public Teacher(String firstName, String lastname, String login, String password, Gender gender, int salary,
			String id, Faculty faculty, TeacherTitle title, float rating) {
		super(firstName, lastname, login, password, gender, salary, id);
		this.faculty = faculty;
		this.title = title;
		this.rating = rating;
	}
	public Faculty getFaculty() {
		return faculty;
	}
	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}
	public TeacherTitle getTitle() {
		return title;
	}
	public void setTitle(TeacherTitle title) {
		this.title = title;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public Vector<Course> getTeaches() {
		return teaches;
	}
}
