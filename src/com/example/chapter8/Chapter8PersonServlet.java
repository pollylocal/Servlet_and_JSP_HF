package com.example.chapter8;


import com.example.chapter5.Dog;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Chapter8PersonServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        Person person = new Person();
        person.setName("TestName");
        Dog dog = new Dog("MiniatureSchnauzer");
        person.setDog(dog);
        request.setAttribute("person", person);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/chapter8/resultPerson.jsp");
        dispatcher.forward(request, resp);
    }
}
