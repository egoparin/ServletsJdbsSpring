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
import java.time.LocalDate;
import java.util.List;

/**
 * Class show simple example servlets.
 */
@WebServlet("/signUp")
public class SignUpServlet extends HttpServlet {

    private UsersRepository usersRepository;

    @Override
    public void init() {
        usersRepository = new UsersRepositoryInMemoryImpl();
    }

    /**
     * Get table of users.
     *
     * @param req  request.
     * @param resp responce.
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<User> userList = usersRepository.findAll();
        req.setAttribute("usersFromServer", userList);

        RequestDispatcher requestDispatcher = req.getRequestDispatcher("/tableUsers.jsp");
        requestDispatcher.forward(req, resp);
    }

    /**
     * Add user and forward.
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        String name = req.getParameter("name");
        String password = req.getParameter("password");
        LocalDate birthDay = LocalDate.parse(req.getParameter("birthDay"));

        User user = new User(id, name, password, birthDay);
        usersRepository.save(user);

        doGet(req, resp);
    }
}
