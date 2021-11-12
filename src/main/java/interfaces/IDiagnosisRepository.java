/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entities.Diagnosis;
import entities.Lab;

import java.util.ArrayList;

/**
 *
 * @author brian
 */
public interface IDiagnosisRepository {
    void addDiagnosis(Diagnosis diagnosis);

    ArrayList<Diagnosis> patientHistory(String regNO);

    Diagnosis currentDiagnosis(String regNO);

    ArrayList<Lab> retrivelabTests(String regNO);

  void addLabResults(ArrayList<Lab> labs,String diagnosisID);

    ArrayList<Diagnosis> retriveDiagnosis();
}
