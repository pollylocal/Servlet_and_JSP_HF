package com.example.chapter5;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ListenerTesterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        out.println("<br>Test context attributes set by listener: ");
        Dog dog =(Dog) getServletContext().getAttribute("dog");

        out.println("<br><br> Dog's breed is " + dog.getBreed());
    }
}
