package org.example;

//import jakarta.servlet.http.HttpServlet;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest httpServletRequest,
                      HttpServletResponse httpServletResponse) throws IOException {
//        httpServletResponse.getWriter().print("Hello from servlet");
        PrintWriter out = httpServletResponse.getWriter();
        httpServletResponse.setContentType("text/html");
        out.print("<html><head>");
        out.print("<title>My First Servlet </title>");
        out.print("</head>");
        out.print("<body>");
        out.print("<h1>Hii Welcome to the world of Servlets</h1>");
        out.print("</body>");
        out.print("</head>");
    }
}
