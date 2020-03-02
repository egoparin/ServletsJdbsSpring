package ru.oparin.mvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.oparin.mvc.model.User;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    List<User> findAllByFirstName(String firstName);
}
