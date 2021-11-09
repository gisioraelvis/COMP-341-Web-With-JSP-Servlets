import Respositories.StudentIO;
import entities.FamilyDoctor;
import entities.NextOfKin;
import entities.Student;
import usecase.RegisterNewStudent;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Main {
    public static void main(String[] argv) throws IOException {
        // NextOfKin object
        NextOfKin nextOfKin=new NextOfKin("Oj","Nakuru","0791328653");

        // Familydoctor object
        FamilyDoctor familyDoctor=new FamilyDoctor("elvo","Nakuru","0791328653");
    // Student object
     Student student = new Student("StudentID","surname","firstName","lastName",
             "phone","email","gender","maritalStatus","nationality","religion",
             nextOfKin,"privateHospital","admission","reasonAdmission",
             "previousIllness","medicalHistory","vision","hearing","hearing",
             "hbLevel","A+","urineChemistry","Yes","AOB","Yes",familyDoctor);
        Student student2 = new Student("StudentID","surname","firstName","lastName",
                "phone","email","gender","maritalStatus","nationality","religion",
                nextOfKin,"privateHospital","admission","reasonAdmission",
                "previousIllness","medicalHistory","vision","hearing","hearing",
                "hbLevel","A+","urineChemistry","Yes","AOB","Yes",familyDoctor);
        Student student3 = new Student("StudentID","surname","firstName","lastName",
                "phone","email","gender","maritalStatus","nationality","religion",
                nextOfKin,"privateHospital","admission","reasonAdmission",
                "previousIllness","medicalHistory","vision","hearing","hearing",
                "hbLevel","A+","urineChemistry","Yes","AOB","Yes",familyDoctor);

        //    Student IO
        StudentIO studentio=new StudentIO();

//        RegisterNewStudent registerNewStudent=new RegisterNewStudent(studentio);

        studentio.add(student);
        studentio.add(student3);
        studentio.add(student2);
        studentio.retrieveStudents();



    }

}
