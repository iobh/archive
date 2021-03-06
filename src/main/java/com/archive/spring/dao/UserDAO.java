package com.archive.spring.dao;

import com.archive.spring.exception.UniqueCorruptionException;
import java.util.List;

import com.archive.spring.model.User;

public interface UserDAO {

    public User getCurrentUser();

    public void addUser(User p);

    public void updateUser(User p);

    public List<User> getUserByName(String name);

    public List<User> getAllUsers();

    public User getUser(String email, String pass) throws UniqueCorruptionException;

    public void removeUser(int id);
}
