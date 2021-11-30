package com.matthewpriebe.hpi.controller;

import com.matthewpriebe.hpi.entity.Hospital;
import com.matthewpriebe.hpi.entity.Price;
import com.matthewpriebe.hpi.persistence.HospitalDao;
import com.matthewpriebe.hpi.persistence.PriceDao;
import com.matthewpriebe.hpi.util.PropertiesLoader;
import lombok.extern.log4j.Log4j2;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.Properties;

@WebServlet(
        urlPatterns = {"/getresults"}
)

/** Begins the authentication process using AWS Cognito
 *
 */
@Log4j2
public class Results extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HospitalDao hospital = new HospitalDao();
        PriceDao price = new PriceDao();

        req.setAttribute("hospital", hospital.getAll());
        req.setAttribute("price", price.getAll());

        RequestDispatcher dispatcher = req.getRequestDispatcher("/results.jsp");
        dispatcher.forward(req, resp);
    }
}

