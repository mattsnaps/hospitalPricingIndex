package com.matthewpriebe.hpi.controller;

import com.matthewpriebe.hpi.entity.Price;
import com.matthewpriebe.hpi.persistence.GenericDao;
import lombok.extern.log4j.Log4j2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(
        urlPatterns = {"/getresults"}
)

/** Begins the authentication process using AWS Cognito
 *
 */
@Log4j2
public class Results extends HttpServlet {

    GenericDao priceDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        priceDao = new GenericDao<>(Price.class);

        req.setAttribute("price", priceDao.getAll());

        RequestDispatcher dispatcher = req.getRequestDispatcher("/results.jsp");
        dispatcher.forward(req, resp);
    }
}

