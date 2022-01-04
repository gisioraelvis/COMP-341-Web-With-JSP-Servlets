package Respositories;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.google.gson.Gson;

import entities.User;
import entities.UserList;
import java.io.IOException;
import java.util.ArrayList;
import utils.Utils;

public class UserRepository {

    private String PATH = Utils.databasePath + "users.json";
    private Gson gson = new Gson();

    public ArrayList<User> add(User user) {
        UserList list;
        try {
            String str = utils.IO.readFile(this.PATH);
            if (str.isEmpty()) {

                list = new UserList();
            } else {
                list = this.gson.fromJson(str, UserList.class);
            }
            list.users.add(user);
            // Serialization
            String json = this.gson.toJson(list);
            utils.IO.saveToFile(json, this.PATH);
            return list.users;
        } catch (IOException e) {

        }
        return new ArrayList<User>();
    }

    public ArrayList<User> retrieveUsers() {
        UserList list;
        try {
            String str = utils.IO.readFile(this.PATH);
            if (str.isEmpty()) {
                list = new UserList();
            } else {

                list = this.gson.fromJson(str, UserList.class);
            }

            return list.users;
        } catch (IOException e) {
            e.printStackTrace();
            return new ArrayList<User>();
        }
    }

    public User retrieveUser(String id) {
        ArrayList<User> users = this.retrieveUsers();
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

}
