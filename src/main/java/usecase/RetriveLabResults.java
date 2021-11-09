/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usecase;

import Respositories.DiagnosisRepository;
import entities.Lab;
import java.util.ArrayList;

/**
 *
 * @author brian
 */
public class RetriveLabResults {
//     ArrayList<Lab> results;
    private DiagnosisRepository repo;
    public void RetriveLabResults(DiagnosisRepository repo){
        this.repo = repo;
    }
    
    public ArrayList<Lab> retrive(String regNo){
        ArrayList<Lab>  results = this.repo.retrivelabTests(regNo);
        return results;
    }
}
