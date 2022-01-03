/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import entities.Appointment;

/**
 *
 * @author brian
 */
public interface IStudentSessionRepository {
    void addStudentSession(Appointment session);
    Appointment nextSession();
}
