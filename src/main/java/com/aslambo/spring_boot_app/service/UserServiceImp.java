package com.aslambo.spring_boot_app.service;

import com.aslambo.spring_boot_app.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import com.aslambo.spring_boot_app.model.User;

import java.util.List;

@Service
@Transactional(readOnly = true)
public class UserServiceImp implements UserService {
    private final UserDao usersDAO;

    @Autowired
    public UserServiceImp(UserDao usersDAO) {
        this.usersDAO = usersDAO;
    }

    @Override
    public List<User> getAllUsers() {
        return usersDAO.getAllUsers();
    }

    @Override
    public User getUser(Long id) {
        return usersDAO.getUser(id);
    }

    @Override
    @Transactional
    public void saveUser(User user) {
        usersDAO.saveUser(user);
    }

    @Override
    @Transactional
    public void updateUser(Long id, User updateUser) {
        User userToBeUpdate = getUser(id);
        userToBeUpdate.setName(updateUser.getName());
        userToBeUpdate.setSurname(updateUser.getSurname());
        userToBeUpdate.setEmail(updateUser.getEmail());
    }

    @Override
    @Transactional
    public void deleteUser(Long id) {
        usersDAO.deleteUser(id);
    }

}
