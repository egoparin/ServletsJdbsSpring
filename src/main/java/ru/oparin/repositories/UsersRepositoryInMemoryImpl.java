package ru.oparin.repositories;

import ru.oparin.models.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UsersRepositoryInMemoryImpl implements UsersRepository {
    private List<User> users;

    public UsersRepositoryInMemoryImpl() {
        this.users = new ArrayList<>();
        User user1 = new User("111", "Ivanov Ivan", "12345", LocalDate.of(1995, 2, 2));
        User user2 = new User("112", "Sergeev Sergey", "54321", LocalDate.of(1996, 3, 3));
        User user3 = new User("113", "Egorov Egor", "44444", LocalDate.of(1997, 4, 4));
        users.add(user1);
        users.add(user2);
        users.add(user3);
    }

    public List<User> findAll() {
        return this.users;
    }

    @Override
    public void save(User user) {
        users.add(user);
    }
}
