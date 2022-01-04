/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author ojay
 */
public class Doctor extends User {

    public String name;

    public Doctor(String id, String name, String phoneNumber, String email, String gender) {
        super(id, name, phoneNumber, email, gender);
        this.name = name;

    }
}
