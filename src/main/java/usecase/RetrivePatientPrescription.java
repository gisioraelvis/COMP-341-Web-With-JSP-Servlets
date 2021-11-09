/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usecase;

import Respositories.DiagnosisRepository;
import entities.Diagnosis;

/**
 *
 * @author brian
 */
public class RetrivePatientPrescription {
   private DiagnosisRepository repo;
   public RetrivePatientPrescription(DiagnosisRepository repo){
       this.repo = repo;
   }
   
   public String retrive(String regNo){
       Diagnosis currentDiagnosis = this.repo.currentDiagnosis(regNo);
       return currentDiagnosis.prescription;
   }
}
