package ru.oparin.dao;

import java.util.List;
import java.util.Optional;

/**
 * 05.02.2019
 * CrudDao
 *
 * @author Oparin Egor
 * @version v1.0
 */
public interface CrudDao<T> {
    Optional<T> find(Integer id);

    void save(T model);

    void update(T model);

    void delete(Integer id);

    List<T> findAll();
}
