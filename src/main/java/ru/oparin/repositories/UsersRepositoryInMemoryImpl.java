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
        findAll().it
    }

    @Override
    public void save(User user) {
        FakeStorage.getInstance().getUsers().add(user);
    }
}
