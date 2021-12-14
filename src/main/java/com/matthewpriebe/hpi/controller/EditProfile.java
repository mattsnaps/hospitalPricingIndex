package com.matthewpriebe.hpi.controller;

import com.matthewpriebe.hpi.entity.User;
import com.matthewpriebe.hpi.persistence.GenericDao;
import lombok.extern.log4j.Log4j2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(
        urlPatterns = {"/editProfile"}
)

@Log4j2
public class EditProfile extends HttpServlet {

    GenericDao userDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        userDao = new GenericDao<>(User.class);

        HttpSession session = req.getSession(false);

        int id = (int) session.getAttribute("user_id");

        log.info(id);
        log.info(req.getParameter("firstName"));
        log.info(req.getParameter("lastName"));

        User userToUpdate = (User) userDao.getById(id);

        userToUpdate.setFirstName(req.getParameter("firstName"));
        userToUpdate.setLastName(req.getParameter("lastName"));

        userDao.saveOrUpdate(userToUpdate);

        session.setAttribute("first_name", req.getParameter("firstName"));
        session.setAttribute("last_name", req.getParameter("lastName"));

        RequestDispatcher dispatcher = req.getRequestDispatcher("updateSuccess.jsp");
        dispatcher.forward(req, resp);
    }
}
