package com.matthewpriebe.hpi.controller;

import com.matthewpriebe.hpi.util.PropertiesLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Properties;

@WebServlet(
        urlPatterns = {"/logIn"}
)

/** Begins the authentication process using AWS Cognito
 *
 */
public class LogIn extends HttpServlet implements PropertiesLoader {

    /**
     * Route to the aws-hosted cognito login page.
     * @param req servlet request
     * @param resp servlet response
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // TODO if properties weren't loaded properly, route to an error page

        ServletContext ctx = req.getServletContext();
        Properties properties = (Properties) ctx.getAttribute("cognitoProperties");

        String url = properties.getProperty("loginURL") + "?response_type=code&client_id=" + properties.getProperty("client.id") + "&redirect_uri=" + properties.getProperty("redirectURL");
        resp.sendRedirect(url);
    }
}
