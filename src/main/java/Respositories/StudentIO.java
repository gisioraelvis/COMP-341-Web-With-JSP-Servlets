package Respositories;

import com.google.gson.Gson;
import entities.Student;
import entities.StudentList;
import interfaces.IStudentIO;
import utils.Utils;
import utils.IO;

import java.io.IOException;
import java.util.ArrayList;

public class StudentIO implements IStudentIO {
    private String PATH = Utils.databasePath + "student.json";
    private Gson gson = new Gson();

    public void add(Student student) {
        StudentList list;
        try {
            String studentListStr = IO.readFile(this.PATH);
            System.out.println(studentListStr);
            if (studentListStr.isEmpty()) {

                list = new StudentList();
            } else {
                list = this.gson.fromJson(studentListStr, StudentList.class);
            }
            list.students.add(student);
            // Serialization
            String json = this.gson.toJson(list);
            IO.saveToFile(json, this.PATH);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public ArrayList<Student> retrieveStudents() {
        try {
            String studentListStr = IO.readFile(this.PATH);
            StudentList list = this.gson.fromJson(studentListStr, StudentList.class);
            return list.students;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public Student retrieveStudent(String regNo) {
        ArrayList<Student> students = this.retrieveStudents();
        for (Student student : students) {
            if (student.getRegNo() == regNo) {
                return student;
            }
        }
        return null;
    }
}