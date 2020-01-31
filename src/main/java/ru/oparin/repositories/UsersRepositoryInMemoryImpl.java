package ru.oparin.repositories;

import ru.oparin.models.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class UsersRepositoryInMemoryImpl implements UsersRepository {
    private List<User> users;

    public UsersRepositoryInMemoryImpl() {}

    public UsersRepositoryInMemoryImpl(List<User> users) {
        this.users = new ArrayList<>();
        User user1 = new User("111","Ivanov Ivan", "12345", LocalDate.parse("1995-02-02"));
        User user2 = new User("112","Sergeev Sergey", "54321", LocalDate.parse("1993-03-32")) ;
        User user3 = new User("113","Egorov Egor", "44444", LocalDate.parse("1994-04-04"));
        users.add(user1);
        users.add(user2);
        users.add(user3);
    }

    public List<User> findAll(){
        return this.users;
    }
}
