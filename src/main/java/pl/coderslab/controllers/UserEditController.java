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

@WebServlet("/user/edit")
public class UserEditController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id = Integer.parseInt(req.getParameter("id"));
        HttpSession session = req.getSession();

        UserDao userDao = new UserDao();
        User user = userDao.read(id);
        session.setAttribute("user", user);

        getServletContext().getRequestDispatcher("/WEB-INF/views/user-edit.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("userName");
        String email = req.getParameter("userEmail");
        String password = req.getParameter("userPassword");
        int id = Integer.parseInt(req.getParameter("id"));

        User user = new User();
        user.setUsername(username);
        user.setEmail(email);
        user.setPassword(password);
        user.setId(id);

        UserDao userDao = new UserDao();
        userDao.update(user);

        resp.sendRedirect(req.getContextPath() + "/user/list");
    }
}
