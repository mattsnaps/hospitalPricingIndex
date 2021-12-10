package com.matthewpriebe.hpi.controller;

import com.matthewpriebe.hpi.entity.Price;
import com.matthewpriebe.hpi.entity.Procedure;
import com.matthewpriebe.hpi.persistence.GenericDao;
import com.matthewpriebe.hpi.persistence.GoogleSearchDao;
import lombok.extern.log4j.Log4j2;
import org.hibernate.Session;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import javax.servlet.http.HttpSession;

@WebServlet(
        urlPatterns = {"/getProcedureProfile"}
)

/**
 *
 */
@Log4j2
public class ProcedureProfile extends HttpServlet {

    GenericDao procedureDao;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GoogleSearchDao googleSearch = new GoogleSearchDao();
        procedureDao = new GenericDao<>(Procedure.class);

        int procedureId = Integer.parseInt(req.getParameter("procedureId"));

        //Procedure retrievedProcedure = (Procedure) procedureDao.getById(procedureId);

        req.setAttribute("Test", procedureId);
        req.setAttribute("Google", googleSearch.getSnippet(req.getParameter("procedureDesc")).getOrganicResults());

        RequestDispatcher dispatcher = req.getRequestDispatcher("/procedureProfile.jsp");
        dispatcher.forward(req, resp);
    }
}
