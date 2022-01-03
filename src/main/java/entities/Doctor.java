/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author ojay
 */
public class Doctor {
       public String name;
       public String phoneNumber;
       public String id;
       public String email;
       public Doctor(String id, String name,String phoneNumber,String email){
           this.name = name;
           this.id=id;
           this.email = email;
           this.phoneNumber = phoneNumber;
       }
}
