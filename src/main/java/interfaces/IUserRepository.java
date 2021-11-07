/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

import java.util.ArrayList;

/**
 *
 * @author brian
 */

public interface  IUserRepository{
    User addNewUser(User user);
    User retriveUser (String regNo);
    ArrayList<User> retriveUsers();
}
