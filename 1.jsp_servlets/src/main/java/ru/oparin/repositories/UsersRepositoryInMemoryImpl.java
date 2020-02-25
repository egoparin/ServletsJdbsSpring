package ru.oparin.repositories;

import ru.oparin.fake.FakeStorage;
import ru.oparin.models.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UsersRepositoryInMemoryImpl implements UsersRepository {

    public List<User> findAll() {
        return FakeStorage.getInstance().getUsers();
    }

    @Override
    public boolean isExists(String name, String password) {
        return findAll().stream()
                .anyMatch(u -> u.getName().equals(name) && u.getPassword().equals(password));
    }

    @Override
    public void save(User user) {
        FakeStorage.getInstance().getUsers().add(user);
    }
}
