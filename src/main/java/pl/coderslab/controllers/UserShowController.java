package pl.coderslab.controllers;

import pl.coderslab.entity.User;
import pl.coderslab.entity.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/user/show")
public class UserShowController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        HttpSession session = req.getSession();

        UserDao userDao = new UserDao();
        User user = userDao.read(id);
        session.setAttribute("user", user);

        getServletContext().getRequestDispatcher("/WEB-INF/views/user-show.jsp").forward(req, resp);
    }
}
