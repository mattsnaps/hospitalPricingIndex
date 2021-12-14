package com.matthewpriebe.hpi.controller;

import com.matthewpriebe.hpi.entity.ProcedureType;
import com.matthewpriebe.hpi.entity.User;
import com.matthewpriebe.hpi.persistence.GenericDao;
import com.mysql.cj.Session;
import lombok.extern.log4j.Log4j2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet(
        urlPatterns = {"/profile"}
)
@Log4j2

public class Profile extends HttpServlet {

    GenericDao userDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession(false);

        String userName;

        userName = (String) session.getAttribute("username");

        if (userName == null) {
            RequestDispatcher dispatcher = req.getRequestDispatcher("logIn");
            dispatcher.forward(req, resp);
        } else {

            userDao = new GenericDao<>(User.class);

            List<User> retreivedUser = userDao.findByPropertyEqual("email", userName);

            String firstName = "";
            String lastName = "";
            int id = 0;

            for (User item : retreivedUser) {
                firstName = item.getFirstName();
                lastName = item.getLastName();
                id = item.getId();
            }

            session.setAttribute("first_name", firstName);
            session.setAttribute("last_name", lastName);
            session.setAttribute("user_id", id);

            RequestDispatcher dispatcher = req.getRequestDispatcher("profile.jsp");
            dispatcher.forward(req, resp);
        }
    }
}
