package com.example.chapter5;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

public class TestInitParams extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.println("Test init parameters<br>");
        Enumeration<String> enumeration = getServletConfig().getInitParameterNames();
        while(enumeration.hasMoreElements()){
            out.println("<br> parameterName = " + enumeration.nextElement());
        }
        out.println("<br> main email : " + getServletConfig().getInitParameter("main-email"));
        out.println("<br>");
        out.println("<br> admin email : " + getServletConfig().getInitParameter("admin-email"));
    }
}
