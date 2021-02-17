package com.tatyana;

import java.util.HashMap;
import java.util.Map;

public class MapClass {

    Map<String, String> users;

    public MapClass() {
        users = new HashMap<>();
        users.put("alexusa", "Aleksey");
    }

    public void register(String login, String username) {
        if (users.containsKey(login)) {
            System.out.println("A user with this name already exists.");
        } else {
            users.put(login, username);
            System.out.println("You have successfully created a new user with login: " + login + " and username: " + username);
        }
    }

    public void deleteUser(String login) {
        if (users.containsKey(login)) {
            users.remove(login);
            System.out.println("The user with login " + login + " has been deleted");
        } else {
            System.out.println("There is no user with login " + login + " to delete");
        }
    }
}
