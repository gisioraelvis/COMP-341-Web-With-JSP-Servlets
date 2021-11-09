/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usecase;

import Respositories.DiagnosisRepository;
import entities.Lab;
import entities.StudentSession;
import java.util.ArrayList;
import java.util.Date;


public class EnterLabResults {
    private DiagnosisRepository repo ;
    private BookSession bookSession;
    public  EnterLabResults(DiagnosisRepository repo, BookSession sRepo){
        this.repo = repo;
        this.bookSession = sRepo;
    }
    
    public ArrayList<Lab> saveResults(ArrayList<Lab> results,String regNo){
        ArrayList<Lab> labResults = this.repo.addLabResults(results);
        //re-schedule the student again with the doctor
        String time = "LocalDate.now().toString()";
        StudentSession student = new StudentSession(regNo,"Lab Results",time);
        this.bookSession.addSession(student);
        return labResults;
    }
}
