/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Respositories;

import interfaces.Diagnosis;
import interfaces.IDiagnosisRepository;
import interfaces.Lab;
import java.util.ArrayList;

/**
 *
 * @author brian
 */
public  class  DiagnosisRepository  implements IDiagnosisRepository{

    @Override
    public Diagnosis addDiagnosis(Diagnosis diagnosis) {
        //use diagnosis key and override data in the json 
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Diagnosis> returnPatientHistory(String regNO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Diagnosis currentDiagnosis(String regNO) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Lab> retrivelabTests(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<Lab> addLabResults(ArrayList<Lab> al) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  

}
