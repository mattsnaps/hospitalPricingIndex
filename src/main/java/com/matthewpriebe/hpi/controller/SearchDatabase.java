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

/**
 * Servlets to direct the search
 */
@WebServlet(
        urlPatterns = {"/searchDatabase"}
)

public class SearchDatabase extends HttpServlet {

    GenericDao procedureDao;

    /**
     * Directs the serach based on the various inputs.
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if (req.getParameter("submit").equals("procedureType")) {
            req.setAttribute("Test", "ProcedureType");
            req.setAttribute("Type", req.getParameter("procedureTypeSelect"));
        } else if (req.getParameter("submit").equals("procedure")) {
            req.setAttribute("Test", "Procedure");
            req.setAttribute("Type", req.getParameter("procedureSelect"));
        } else if (req.getParameter("submit").equals("hospital")) {
            req.setAttribute("Test", "Hospital");
            req.setAttribute("Type", req.getParameter("hospitalNameSelect"));
        } else {
            req.setAttribute("Test", "Error");
        }

        RequestDispatcher dispatcher = req.getRequestDispatcher("/searchResults.jsp");
        dispatcher.forward(req, resp);
    }
}
