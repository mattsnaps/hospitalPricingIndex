package com.matthewpriebe.hpi.controller;

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
        urlPatterns = {"/profile"}
)
@Log4j2

public class Profile extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession(false);
        if (session.getAttribute("username") == null) {
            RequestDispatcher dispatcher = req.getRequestDispatcher("logIn");
            dispatcher.forward(req, resp);
        } else {
            RequestDispatcher dispatcher = req.getRequestDispatcher("profile.jsp");
            dispatcher.forward(req, resp);
        }
    }
}
