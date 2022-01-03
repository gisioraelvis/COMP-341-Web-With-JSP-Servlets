package Respositories;

import entities.Diagnosis;
import entities.DiagnosisList;
import interfaces.IDiagnosisRepository;
import entities.Lab;
import utils.Utils;
import utils.IO;
import java.io.IOException;
import java.util.ArrayList;

import com.google.gson.Gson;

public class DiagnosisRepository implements IDiagnosisRepository {
    private String PATH = Utils.databasePath + "diagnosis.json";
    private Gson gson = new Gson();

    public void addDiagnosis(Diagnosis diagnosis) {
        DiagnosisList list;
        try {
            String diagnosisLisStr = IO.readFile(this.PATH);
            if (diagnosisLisStr.isEmpty()) {
                list = new DiagnosisList();
            } else {
                list = this.gson.fromJson(diagnosisLisStr, DiagnosisList.class);
            }
            list.diagnosis.add(diagnosis);
            // Serialization
            String json = this.gson.toJson(list);
            IO.saveToFile(json, this.PATH);
        } catch (IOException e) {
            
        } // Tools | Templates.
    }

      public ArrayList<Diagnosis> retriveDiagnosis() {
        DiagnosisList list;
        try {
            
            String str = utils.IO.readFile(this.PATH);
            if(str.isEmpty()){
                list = new DiagnosisList();
            }
            else{
            list = this.gson.fromJson(str, DiagnosisList.class);

            }
            return list.diagnosis;
        } catch (IOException e) {
        }
        return new ArrayList<Diagnosis>();

        
    }

    @Override
    public ArrayList<Diagnosis> patientHistory(String patientId) {
        ArrayList<Diagnosis> diagnosis = this.retriveDiagnosis();
        for (Diagnosis d : diagnosis) {
            if (patientId.equals(d.user.getId())) {
                diagnosis.add(d);
            }
        }
        ArrayList<Diagnosis> history = new ArrayList<>();
        return history;
    }

    @Override
    public Diagnosis currentDiagnosis(String patientId) {
        ArrayList<Diagnosis> diagnosis = this.patientHistory(patientId);
        if (diagnosis.isEmpty()) {
            return null;
        }
        return (Diagnosis) diagnosis.get(diagnosis.size() - 1);
    }

    @Override
    public ArrayList<Lab> retrivelabTests(String patientId) {
        Diagnosis diagnosis = this.currentDiagnosis(patientId);
        if (diagnosis == null) {
            return null;
        }
        return diagnosis.lab;
    }

    @Override
    public void addLabResults(ArrayList<Lab> lab, String diagnosisID) {
        ArrayList<Diagnosis> diagnosisList = this.retriveDiagnosis();
        for (Diagnosis d : diagnosisList) {
            if (d.id.equals(diagnosisID)) {
                d.lab = lab;
                try {
                    String json = this.gson.toJson(new DiagnosisList(diagnosisList));
                    IO.saveToFile(json, this.PATH);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                break;
            }
        }

    }
}
