package Comparators;

import java.util.Comparator;

import users.Student;

public class GpaComparator implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if(o1.getGpa() > o2.getGpa()) return 1;
        else if(o1.getGpa() == o2.getGpa()) return 0;
        return -1;
    }
    
}
