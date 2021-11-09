/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author brian
 */
public class Lab {
   public String test;
   public String results;
   public String diagnosisID;
   
   public Lab(String test,String results,String diagnosisID){
       this.diagnosisID = diagnosisID;
       this.test = test;
       this.results = results;
   }
   
   Lab(String test,String diagnosisID){
       this.diagnosisID = diagnosisID;
       this.test = test;
   }
}
