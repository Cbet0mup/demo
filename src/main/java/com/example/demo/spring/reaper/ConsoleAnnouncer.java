package com.example.demo.spring.reaper;

public class ConsoleAnnouncer implements Announcer {
    private  Recomendator recomendator = ObjectFactory.getInstance().createObject(Recomendator.class);
    @Override
    public void announce(String message) {
        System.out.println(message);
        recomendator.recommend();
    }
}
