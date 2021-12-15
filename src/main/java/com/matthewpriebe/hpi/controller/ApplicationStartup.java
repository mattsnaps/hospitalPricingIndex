package com.matthewpriebe.hpi.controller;

import com.matthewpriebe.hpi.util.PropertiesLoader;
import lombok.extern.log4j.Log4j2;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.util.Properties;

/**
 *Servlet that on startup put the cognito and serpapi properties into servlet context
 * @author priebe
 */

@WebServlet (
        name = "applicationStartup",
        urlPatterns = {"/pricing-index-startup"},
        loadOnStartup = 1
)
@Log4j2
public class ApplicationStartup extends HttpServlet implements PropertiesLoader {


    public void init(ServletConfig config)
        throws ServletException {

        ServletContext ctx = config.getServletContext();

        Properties cognitoProperties = new Properties();
        try {
            cognitoProperties = loadProperties("/cognito.properties");

        } catch (Exception e) {
            log.info(e);
        }

        Properties serpapiProperties = new Properties();
        try {
            serpapiProperties = loadProperties("/serpapi.properties");

        } catch (Exception e) {
            log.info(e);
        }
        ctx.setAttribute("cognitoProperties", cognitoProperties);
        ctx.setAttribute("serapiProperties", serpapiProperties);
    }
}
