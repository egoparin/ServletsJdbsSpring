package ru.oparin.mvc.app;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import ru.oparin.mvc.dao.UsersDao;
import ru.oparin.mvc.dao.UsersDaoJdbcTemplateImpl;

import java.util.List;

public class Main {
    public static <User> void main(String[] args) {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("org.postgresql.Driver");
        dataSource.setUsername("egor.oparin");
        dataSource.setPassword("1");
        dataSource.setUrl("jdbc:postgresql://localhost:5432/testSpringMvc");

        UsersDao usersDao = new UsersDaoJdbcTemplateImpl(dataSource);

        List<ru.oparin.mvc.model.User> users = usersDao.findAll();

        System.out.println(users);
    }
}
