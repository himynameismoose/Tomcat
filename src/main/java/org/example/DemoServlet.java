package org.example;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

// Step 1: The servlet extends HttpServlet
public class DemoServlet extends HttpServlet {
    private int count = 0;

    // Step 2: Create the init method
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("Servlet Initialized ... value of count is: " + count);
    }

    // Step 3: Develop the doGet method
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Request Number: " + count + " is received");
    }

    // Step 4: Develop the destroy method

    @Override
    public void destroy() {
        System.out.println("Servlet removed from service ... Total visitor count is " + count);
    }
}
