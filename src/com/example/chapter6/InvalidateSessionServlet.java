package com.example.chapter6;

import com.example.chapter5.Dog;

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
        session.setAttribute("dog", new Dog("breed"));
        //        session.invalidate();
        session.setMaxInactiveInterval(1);
        String foo = (String) session.getAttribute("foo");
        if (session.isNew())
        {
            out.println("This is new session");
        }
        out.println("Foo: " + foo);
    }
}
