package ru.alexkonst.pp312_SpringBoot.services;

import ru.alexkonst.pp312_SpringBoot.model.User;

import java.util.List;

public interface UserService {

    List<User> showAllUsers();

    User showUserById(int id);

    void saveUser(User user);

    void updateUser(int id, User user);

    void deleteUser(int id);
}
