package com.matthewpriebe.hpi.controller;

import com.matthewpriebe.hpi.entity.Price;
import com.matthewpriebe.hpi.entity.ProcedureType;
import com.matthewpriebe.hpi.persistence.GenericDao;
import com.matthewpriebe.hpi.util.PropertiesLoader;
import lombok.extern.log4j.Log4j2;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(
        urlPatterns = {"/search"}
)
@Log4j2
public class Search extends HttpServlet implements PropertiesLoader {

    GenericDao procedureTypeDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        procedureTypeDao = new GenericDao<>(ProcedureType.class);

        req.setAttribute("procedureType", procedureTypeDao.getAll());

        RequestDispatcher dispatcher = req.getRequestDispatcher("/search.jsp");
        dispatcher.forward(req, resp);

    }
}
