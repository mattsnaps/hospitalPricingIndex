package com.matthewpriebe.hpi.controller;

import com.matthewpriebe.hpi.entity.Hospital;
import com.matthewpriebe.hpi.entity.Price;
import com.matthewpriebe.hpi.entity.PriceId;
import com.matthewpriebe.hpi.entity.Procedure;
import com.matthewpriebe.hpi.persistence.GenericDao;
import com.matthewpriebe.hpi.persistence.GoogleSearchDao;
import com.matthewpriebe.hpi.persistence.PriceDao;
import lombok.extern.log4j.Log4j2;
import org.hibernate.Session;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpSession;

@WebServlet(
        urlPatterns = {"/getProcedureProfile"}
)

/**
 *Serlvet for the profile for the individual procedures.
 */
@Log4j2
public class ProcedureProfile extends HttpServlet {
    
    GenericDao procedureDao;

    /**
     * Get all the procedure information. Calls the good api and runs a search.
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        GoogleSearchDao googleSearch = new GoogleSearchDao();
        procedureDao = new GenericDao<>(Procedure.class);

        int procedureId = Integer.parseInt(req.getParameter("procedureId"));

        String searchParameter;
        Procedure retrievedProcedure;

        retrievedProcedure = (Procedure) procedureDao.getById(procedureId);

        searchParameter = retrievedProcedure.getCodeDescription();

        req.setAttribute("procedureDesc", searchParameter);
        req.setAttribute("procedureId", procedureId);
        req.setAttribute("google", googleSearch.getSnippet(searchParameter));

        RequestDispatcher dispatcher = req.getRequestDispatcher("/procedureProfile.jsp");
        dispatcher.forward(req, resp);
    }
}
