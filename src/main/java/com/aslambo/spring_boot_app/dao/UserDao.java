package com.aslambo.spring_boot_app.dao;


import com.aslambo.spring_boot_app.model.User;

import java.util.List;

public interface UserDao {

    List<User> getAllUsers();

    void saveUser(User user);

    User getUser(Long id);

    void deleteUser(Long id);
}
