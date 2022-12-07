package com.example.demo.spring.reaper;

import java.lang.reflect.InvocationTargetException;

public class Main {
    public static void main(String[] args) throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        CoronaDesinfector desinfector = new CoronaDesinfector();
        desinfector.start(new Room());
    }
}
