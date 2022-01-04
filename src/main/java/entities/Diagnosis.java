/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package entities;

import java.time.LocalDate;
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
    public LocalDate date;
    public String time;

    //consulation constractor create new diagnosis
    public Diagnosis(User user, String id, String consultation, String notes, String prescription,ArrayList<Lab> lab) {
        this.user = user;
        this.id = id;
        this.consultation = consultation;
        this.notes = notes;
        this.date = LocalDate.now();
        this.prescription = prescription;
        this.lab = lab;
    }
    public String getTests(){
        String test = "";
        for(Lab l:this.lab){
            test += l.test + ", ";
        }
       return test;
    }
    //needs a lab result first before giving a prescription
    

}
