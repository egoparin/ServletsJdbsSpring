package ru.oparin.repositories;

import ru.oparin.models.User;

import java.util.List;

public interface UsersRepository {
    List<User> findAll();
    void save(User user);
}
