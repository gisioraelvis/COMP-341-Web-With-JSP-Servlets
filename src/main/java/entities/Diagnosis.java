/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package entities;

import java.util.ArrayList;

/**
 *
 * @author brian
 */
public class Diagnosis {

    public User user;
    public String consultation;
    public ArrayList<Lab> lab;
    public String notes;
    public String prescription;
    public String id;
    
    public Diagnosis(User user, String consultation,ArrayList<Lab> lab, String notes, 
                     String prescription, String id){
        this.user = user;
        this.id = id;
        this.consultation = consultation;
        this.notes = notes;
        this.lab = lab;
        this.prescription = prescription;
    }
    //consulation constractor
        Diagnosis(User user, String consultation, String notes,String id){
        this.user = user;
        this.id = id;
        this.consultation = consultation;
        this.notes = notes;
    }
    //needs a lab result first before giving a prescription
        Diagnosis(User user, String consultation, String notes,String id,ArrayList<Lab> lab){
        this.user = user;
        this.id = id;
        this.consultation = consultation;
        this.notes = notes;
        this.lab = lab;
    }   
    
}

