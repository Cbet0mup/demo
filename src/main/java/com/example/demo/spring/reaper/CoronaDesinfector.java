package com.example.demo.spring.reaper;

import java.lang.reflect.InvocationTargetException;

public class CoronaDesinfector {

    private Announcer announcer = ObjectFactory.getInstance().createObject(Announcer.class);
    private Policeman policeman = ObjectFactory.getInstance().createObject(Policeman.class);

    public CoronaDesinfector() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
    }

    public void start(Room room) {

        announcer.announce("Начинаем дизинфекцию! все вон!!");
        policeman.makePeopleLeaveRoom();
        announcer.announce("Можете заходить обратно!");

    }

    public void disinfect(Room room) {
        System.out.println("зачитывается молитваЖ 'корона изыди!!!'");
    }
}
