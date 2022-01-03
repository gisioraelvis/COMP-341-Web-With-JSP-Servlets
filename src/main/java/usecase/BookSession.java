/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usecase;

import Respositories.StudentSessionRepository;
import entities.Appointment;

/**
 *
 * @author brian
 */
public class BookSession {
    private StudentSessionRepository repo;
    public BookSession(StudentSessionRepository repo){
        this.repo = repo;
    }
    
    void addSession(Appointment student){
        this.repo.addStudentSession(student);
    }
    
    Appointment next(){
       return this.repo.nextSession();
    }
}
