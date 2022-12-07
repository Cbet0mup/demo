package com.example.demo.spring.reaper;

import java.lang.reflect.InvocationTargetException;

public class ConsoleAnnouncer implements Announcer {
    private  Recomendator recomendator = ObjectFactory.getInstance().createObject(Recomendator.class);

    public ConsoleAnnouncer() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
    }

    @Override
    public void announce(String message) {
        System.out.println(message);
        recomendator.recommend();
    }
}
