package com.example.demo.lambdas;

import com.example.demo.spring.reaper.AngryPoliceman;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class LamdaMain {
    public static void main(String[] args) {
        List<AngryPoliceman> persons = new ArrayList<>();
        persons.add(new AngryPoliceman("ergerg"));
        persons.add(new AngryPoliceman("ergergg"));
        persons.add(new AngryPoliceman("ergeghrg"));
        persons.add(new AngryPoliceman("ergejjrg"));

        Map<String, AngryPoliceman> sgsg = persons.stream()
                .collect(Collectors.toMap(AngryPoliceman::getName, Function.identity()));

        System.out.println(sgsg);
    }
}
