/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Respositories;

import com.google.gson.Gson;
import entities.Appointment;
import entities.AppointmentList;
import java.io.IOException;
import java.util.ArrayList;
import utils.Utils;

/**
 *
 * @author ojay
 */
public class AppointmentRepository {

    private String PATH = Utils.databasePath + "appointment.json";
    private Gson gson = new Gson();

    public void addAppointment(Appointment appointment) {
        AppointmentList list;
        try {
            String str = utils.IO.readFile(this.PATH);
            if (str.isEmpty()) {
                list = new AppointmentList();
            } else {
                list = this.gson.fromJson(str, AppointmentList.class);
            }
            list.appointments.add(appointment);
            // Serialization
            String json = this.gson.toJson(list);
            utils.IO.saveToFile(json, this.PATH);
        } catch (IOException e) {

        } // Tools | Templates.
    }

    public ArrayList<Appointment> retriveAppointments() {
        AppointmentList list;
        try {

            String str = utils.IO.readFile(this.PATH);
            if (str.isEmpty()) {
                list = new AppointmentList();
            } else {
                list = this.gson.fromJson(str, AppointmentList.class);

            }
            return list.appointments;
        } catch (IOException e) {
        }
        return new ArrayList<Appointment>();

    }

    public void deleteAppointment(String id) {
        try {
            AppointmentList list = new AppointmentList();
            for (Appointment appointment : retriveAppointments()) {
                if (!appointment.id.equals(id)) {
                    list.appointments.add(appointment);
                }
            }

            String json = this.gson.toJson(list);
            utils.IO.saveToFile(json, this.PATH);
        } catch (IOException e) {

        }

    }
}
