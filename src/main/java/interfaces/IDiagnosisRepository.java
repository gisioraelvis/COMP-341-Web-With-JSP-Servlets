/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import java.util.ArrayList;

/**
 *
 * @author brian
 */
public interface IDiagnosisRepository {
    Diagnosis addDiagnosis(Diagnosis diagnosis);
    ArrayList<Diagnosis> returnPatientHistory(String regNO);
    Diagnosis currentDiagnosis(String regNO);
    ArrayList<Lab> retrivelabTests(String regNO);
    ArrayList<Lab> addLabResults(ArrayList<Lab> labresults); 
}
