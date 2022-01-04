/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

import java.util.ArrayList;

/**
 *
 * @author brian
 */
public class UserRecords {

    private User user;
    private ArrayList<Diagnosis> medHistory;

    public UserRecords(User user, ArrayList<Diagnosis> history) {
        this.user = user;
        this.medHistory = history;
    }

    public User getUser() {
        return this.user;
    }

    public ArrayList<Diagnosis> getMedHistory() {
        return this.medHistory;
    }
}
