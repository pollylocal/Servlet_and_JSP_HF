package com.example.chapter5;

import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

public class Dog implements HttpSessionBindingListener
{

    private final String breed;

    public Dog(String breed) {
        this.breed = breed;
    }

    public String getBreed() {
        return breed;
    }

    @Override
    public void valueBound(HttpSessionBindingEvent httpSessionBindingEvent)
    {
        System.out.println("Dog is bounded to session");
    }

    @Override
    public void valueUnbound(HttpSessionBindingEvent httpSessionBindingEvent)
    {
        System.out.println("Dog is unbounded from session");
    }
}
