package users;

import classes.Course;
import enums.Gender;
import enums.ManagerType;

public class Manager extends Employee {
    ManagerType type;

    public Manager(String firstName, String lastname, String login, String password, Gender gender, int salary,
        String id, ManagerType type) {
        super(firstName, lastname, login, password, gender, salary, id);
        this.type = type;
    }

    public void addCourse() {
        
    }

    public void approveRegistration() {
        
    }

    public void assignCourseToTeacher() {
        
    }

    public void addNews() {
        
    }
    public void deleteNews() {
        
    }
    public void updateNews() {
        
    }
    public void viewRequestsFromEmployees() {
        
    }
    public void addCourse(Teacher teacher, Course course) {
        if(type == ManagerType.OFFICE_REGISTRATOR) {
            teacher.getTeaches().add(course);
        }
    }
}