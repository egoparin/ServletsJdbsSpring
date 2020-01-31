package ru.oparin.servlets;

import ru.oparin.models.User;
import ru.oparin.repositories.UsersRepository;
import ru.oparin.repositories.UsersRepositoryInMemoryImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 *
 */
@WebServlet("/signUp")
public class SignUpServlet extends HttpServlet {

    private UsersRepository usersRepository;

    public void init() {
        usersRepository = new UsersRepositoryInMemoryImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> userList = usersRepository.findAll();
        req.setAttribute("usersFromServer", userList);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/jsp/singUp.jsp");
        requestDispatcher.forward(req, resp);
    }
}
