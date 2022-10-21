package com.example.demo.spring.reaper;

public class RecomendatorImpl implements Recomendator {
    @InjectProperty
    private String alcohol;

    @Override
    public void recommend() {
        System.out.println(" to protect from covid-2019, drink " + alcohol);
    }
}
