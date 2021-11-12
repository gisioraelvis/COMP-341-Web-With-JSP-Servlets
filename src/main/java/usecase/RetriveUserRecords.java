/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usecase;

import entities.Diagnosis;
import entities.User;
import entities.UserRecords;
import interfaces.*;
import java.util.ArrayList;

/**
 *
 * @author brian
 */
public class RetriveUserRecords {
    private IUserRepository  repo;
        private IDiagnosisRepository  diagRepo;

    public void RetiveUserRecords(IUserRepository  repo,IDiagnosisRepository diagRepo){
        this.repo = repo;
        this.diagRepo = diagRepo;
    }
    
  public UserRecords retrive(String regNo){
       //retrive user details
        User userDetails = this.repo.retriveUser(regNo);
        //retrive medical history
        ArrayList<Diagnosis> diagnosis = this.diagRepo.patientHistory(regNo);
        //return both user details and med history
        UserRecords result = new UserRecords(userDetails,diagnosis);
        return result;
    }
}
