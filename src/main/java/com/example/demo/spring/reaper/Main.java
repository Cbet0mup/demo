package com.example.demo.spring.reaper;

public class Main {
    public static void main(String[] args) {
        CoronaDesinfector desinfector = new CoronaDesinfector();
        desinfector.start(new Room());
    }
}
