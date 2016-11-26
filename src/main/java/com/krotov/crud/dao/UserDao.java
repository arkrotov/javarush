package com.krotov.crud.dao;

import com.krotov.crud.model.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface UserDao {

    public void addUser(User user);

    public void updateUser(User user);

    public void removeUser(int id);

    public User getUserById (int id);

    public List<User> listUsers ();


}
