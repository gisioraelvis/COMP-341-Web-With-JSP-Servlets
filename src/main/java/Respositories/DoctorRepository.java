/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Respositories;

import com.google.gson.Gson;
import entities.Doctor;
import entities.DoctorsList;
import java.io.IOException;
import java.util.ArrayList;
import utils.Utils;

/**
 *
 * @author ojay
 */
public class DoctorRepository {

    private String PATH = Utils.databasePath + "doctor.json";
    private Gson gson = new Gson();

    public ArrayList<Doctor> add(Doctor doctor) {
        DoctorsList list;
        try {
            String doctorListStr = utils.IO.readFile(this.PATH);
            if (doctorListStr.isEmpty()) {

                list = new DoctorsList();
            } else {
                list = this.gson.fromJson(doctorListStr, DoctorsList.class);
            }
            list.doctors.add(doctor);
            // Serialization
            String json = this.gson.toJson(list);
            utils.IO.saveToFile(json, this.PATH);
            return list.doctors;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    public ArrayList<Doctor> retrieveDoctors() {
        DoctorsList list;
        try {
            String str = utils.IO.readFile(this.PATH);
            if (str.isEmpty()) {
                list = new DoctorsList();
            } else {

                list = this.gson.fromJson(str, DoctorsList.class);
            }

            return list.doctors;
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<Doctor>();
        }
    }

    public Doctor retrieveDoctor(String id) {
        ArrayList<Doctor> doctors = this.retrieveDoctors();
        for (Doctor doctor : doctors) {
            if (doctor.getId().equals(id)) {
                return doctor;
            }
        }
        return null;
    }
}
