package pl.coderslab.controllers;

import pl.coderslab.domain.User;
import pl.coderslab.domain.UserDao;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/user/delete")
public class UserDeleteController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        HttpSession session = req.getSession();

        UserDao userDao = new UserDao();
        User user = userDao.read(id);
        session.setAttribute("user", user);

        getServletContext().getRequestDispatcher("/WEB-INF/views/user-delete.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        UserDao userDao = new UserDao();
        userDao.delete(id);
        System.out.println("User with ID: " + id + " has been deleted...");

        resp.sendRedirect(req.getContextPath() + "/user/list");
    }
}
