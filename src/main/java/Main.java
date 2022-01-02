import java.io.IOException;
import java.util.ArrayList;

import Respositories.DiagnosisRepository;
import entities.Diagnosis;
import entities.FamilyDoctor;
import entities.Lab;
import entities.NextOfKin;
import entities.Student;

public class Main {
        public static void main(String[] argv) throws IOException {
                // NextOfKin object
                NextOfKin nextOfKin = new NextOfKin("Oj", "Nakuru", "0791328653");

                // Familydoctor object
                FamilyDoctor familyDoctor = new FamilyDoctor("elvo", "Nakuru", "0791328653");
                // Student object
                Student student = new Student("1000","regNo", "surname", "firstName", "lastName", "phone", "email", "gender",
                                "maritalStatus", "nationality", "religion", nextOfKin, "privateHospital", "admission",
                                "reasonAdmission", "previousIllness", "medicalHistory", "vision", "hearing", "hearing",
                                "hbLevel", "A+", "urineChemistry", "Yes", "AOB", "Yes", familyDoctor);
                Student student2 = new Student("StudentID","regNo", "surname", "firstName", "lastName", "phone", "email",
                                "gender", "maritalStatus", "nationality", "religion", nextOfKin, "privateHospital",
                                "admission", "reasonAdmission", "previousIllness", "medicalHistory", "vision",
                                "hearing", "hearing", "hbLevel", "A+", "urineChemistry", "Yes", "AOB", "Yes",
                                familyDoctor);
                Student student3 = new Student("StudentID","regNo", "surname", "firstName", "lastName", "phone", "email",
                                "gender", "maritalStatus", "nationality", "religion", nextOfKin, "privateHospital",
                                "admission", "reasonAdmission", "previousIllness", "medicalHistory", "vision",
                                "hearing", "hearing", "hbLevel", "A+", "urineChemistry", "Yes", "AOB", "Yes",
                                familyDoctor);

                // Student IO
                DiagnosisRepository diagnosisIo = new DiagnosisRepository();
                Lab lab = new Lab("TB", "112");
                ArrayList<Lab> labs = new ArrayList<Lab>();
                labs.add(lab);
                Diagnosis diagnosis1 = new Diagnosis(student, "Hiv/Aids", labs, "notes", "prescription", "12345");
                // RegisterNewStudent registerNewStudent=new RegisterNewStudent(studentio);
                diagnosisIo.addDiagnosis(diagnosis1);
                Lab lab2 = new Lab("TB","POSITIVE" ,"112");
                ArrayList<Lab> labs2 = new ArrayList<Lab>();
                labs2.add(lab2);
                diagnosisIo.addLabResults(labs2, "12345");
               

        }

}
