package com.matthewpriebe.hpi.controller;

import com.matthewpriebe.hpi.entity.Hospital;
import com.matthewpriebe.hpi.entity.Price;
import com.matthewpriebe.hpi.entity.Procedure;
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
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * Servlet for thetype Search.
 */
@WebServlet(
        urlPatterns = {"/search"}
)
@Log4j2
public class Search extends HttpServlet implements PropertiesLoader {

    GenericDao procedureTypeDao;
    GenericDao procedureDao;
    GenericDao priceDao;
    GenericDao hospitalDao;

    /**
     * This gets all the needed information out of the database and puts it into the session.
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        procedureTypeDao = new GenericDao<>(ProcedureType.class);
        procedureDao = new GenericDao<>(Procedure.class);
        hospitalDao = new GenericDao<>(Hospital.class);
        priceDao = new GenericDao<>(Price.class);

        HttpSession session = req.getSession(false);

        session.setAttribute("price", priceDao.getAll());
        session.setAttribute("procedureType", procedureTypeDao.getAll());
        session.setAttribute("hospital", hospitalDao.getAll());
        session.setAttribute("procedure", procedureDao.getAll());

        RequestDispatcher dispatcher = req.getRequestDispatcher("/search.jsp");
        dispatcher.forward(req, resp);

    }
}
