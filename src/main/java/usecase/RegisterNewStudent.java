/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usecase;

import entities.Student;

import interfaces.IStudentIO;

public class RegisterNewStudent {
    private IStudentIO repo;
    public RegisterNewStudent(IStudentIO repo){
        this.repo = repo;
    }
    
    public void register(Student student){
         this.repo.add(student);

    }
}
