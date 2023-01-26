package com.aslambo.spring_boot_app.service;



import com.aslambo.spring_boot_app.model.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    void saveUser(User user);

    User getUser(Long id);

    void updateUser(Long id, User updateUser);

    void deleteUser(Long id);
}
