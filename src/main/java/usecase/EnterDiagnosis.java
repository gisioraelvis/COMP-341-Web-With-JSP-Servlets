/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usecase;

import Respositories.DiagnosisRepository;
import interfaces.Diagnosis;
/**
 *
 * @author brian
 */
public class EnterDiagnosis {
    private DiagnosisRepository repo;
    public EnterDiagnosis(DiagnosisRepository repo){
        this.repo = repo;
    }
    
    public Diagnosis enterPatientDiagnosis(Diagnosis diagnosis){
        Diagnosis savedDiagnosis = this.repo.addDiagnosis(diagnosis);
        return savedDiagnosis;
    }
}
