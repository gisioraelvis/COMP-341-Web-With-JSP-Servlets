package interfaces;

import entities.Student;

import java.util.ArrayList;

public interface IStudentIO {
     void add(Student student);
    ArrayList<Student> retrieveStudents();
}
