package ru.alexkonst.pp312_SpringBoot.dao;

import ru.alexkonst.pp312_SpringBoot.model.User;

import java.util.List;

public interface UserDao {

    List<User> showAllUsers();

    User showUserById(int id);

    void saveUser(User user);

    void updateUser(int id, User user);

    void deleteUserById(int id);
}
