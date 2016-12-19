package com.example.chapter6;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class InvalidateSessionServlet extends HttpServlet
{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        HttpSession session = request.getSession();
        session.setAttribute("foo", "42");
        //        session.invalidate();
        session.setMaxInactiveInterval(0);
        try
        {
            Thread.sleep(1200);
        }
        catch (InterruptedException e)
        {
            e.printStackTrace();
        }
        String foo = (String) session.getAttribute("foo");
        if (session.isNew())
        {
            out.println("This is new session");
        }
        out.println("Foo: " + foo);
    }
}
