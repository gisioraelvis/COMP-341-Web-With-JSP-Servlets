/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author brian
 */
public class Appointment {

    public User user;
    public String intent;
    public String date;
    public String time;
    public Doctor doctor;
    public String id;

    public Appointment(String id, User user, String intent, String Date, String time, Doctor doctor) {
        this.doctor = doctor;
        this.id = id;
        this.intent = intent;
        this.date = Date;
        this.time = time;
        this.user = user;
    }
}
