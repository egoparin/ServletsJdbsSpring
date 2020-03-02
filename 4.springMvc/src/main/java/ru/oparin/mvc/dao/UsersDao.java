package ru.oparin.mvc.dao;


import ru.oparin.mvc.model.User;

import java.util.List;


public interface UsersDao extends CrudDao<User> {
    List<User> findAllByFirstName(String firstName);
}
