package com.example.chapter5;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyFirstServletContextListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContext Initialized");
        ServletContext context = servletContextEvent.getServletContext();
        String breed = context.getInitParameter("breed");
        Dog dog = new Dog(breed);
        context.setAttribute("dog", dog);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("ServletContext Destroyed");
    }
}
