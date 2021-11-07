/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package usecase;

import Respositories.UserRepository;
import interfaces.User;

/**
 *
 * @author brian
 */
public class RegisterNewStudent {
    private UserRepository repo;
    public RegisterNewStudent(UserRepository repo){
        this.repo = repo;
    }
    
    public User register(User newUser){
        User savedUser = this.repo.addNewUser(newUser);
        return savedUser;
    }
}
