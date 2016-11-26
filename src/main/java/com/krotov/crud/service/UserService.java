package com.krotov.crud.service;

import com.krotov.crud.model.User;

import java.util.List;

/**
 * Created by Я on 23.11.2016.
 */
public interface UserService {

    public void addUser(User user);

    public void updateUser(User user);

    public void removeUser(int id);

    public User getUserById (int id);

    public List<User> listUsers ();
}
