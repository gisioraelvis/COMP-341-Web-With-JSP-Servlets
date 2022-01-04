package entities;

import java.util.ArrayList;

public class DiagnosisList {

    public ArrayList<Diagnosis> diagnosis;

    public DiagnosisList() {
        this.diagnosis = new ArrayList<Diagnosis>();
    }

    public DiagnosisList(ArrayList<Diagnosis> diagnosis) {
        this.diagnosis = diagnosis;
    }
}
