package ru.oparin.fake;

import ru.oparin.models.User;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Class fake jdbc repository (singleton).
 */
public class FakeStorage {

    private static volatile FakeStorage instance;

    static {
        instance = new FakeStorage();
    }

    private List<User> users;

    private FakeStorage() {
        this.users = new ArrayList<>();
        User user1 = new User("111", "Ivanov Ivan", "12345", LocalDate.of(1995, 2, 2));
        User user2 = new User("112", "Sergeev Sergey", "54321", LocalDate.of(1996, 3, 3));
        User user3 = new User("113", "Egorov Egor", "44444", LocalDate.of(1997, 4, 4));
        User user4 = new User("113", "A", "1", LocalDate.of(1997, 4, 4));
        users.add(user1);
        users.add(user2);
        users.add(user3);
        users.add(user4);
    }

    public List<User> getUsers() {
        return users;
    }

    public static FakeStorage getInstance() {
        if (instance == null){
            synchronized (FakeStorage.class){
                if (instance == null){
                    instance = new FakeStorage();
                }
            }
        }
        return instance;
    }

}
