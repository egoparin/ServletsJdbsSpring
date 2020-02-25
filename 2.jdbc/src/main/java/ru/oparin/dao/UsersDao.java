package ru.oparin.dao;

import ru.oparin.models.User;

import java.util.List;

/**
 * 05.02.2019
 * UsersDao
 *
 * @author Oparin Egor
 * @version v1.0
 */
public interface UsersDao extends CrudDao<User> {
    List<User> findAllByFirstName(String firstName);
}
