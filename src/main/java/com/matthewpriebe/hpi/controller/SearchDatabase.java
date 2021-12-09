package com.matthewpriebe.hpi.controller;


import com.matthewpriebe.hpi.entity.Procedure;
import com.matthewpriebe.hpi.entity.ProcedureType;
import com.matthewpriebe.hpi.persistence.GenericDao;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(
        urlPatterns = {"/searchDatabase"}
)

public class SearchDatabase extends HttpServlet {

    GenericDao procedureDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        procedureDao = new GenericDao<>(Procedure.class);

        req.getParameter("procedureTypeSelect");

        req.setAttribute("Test", req.getParameter("procedureTypeSelect"));

        List<Procedure> procedures = procedureDao.getAll();

        req.setAttribute("procedureList", procedures);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/searchResults.jsp");
        dispatcher.forward(req, resp);
    }
}
