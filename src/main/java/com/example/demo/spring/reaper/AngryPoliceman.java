package com.example.demo.spring.reaper;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class AngryPoliceman implements Policeman {
    @Getter
    private String name;

    public AngryPoliceman(String name) {
        this.name = name;
    }

    @Override
    public void makePeopleLeaveRoom() {
        System.out.println("Всех убью! Вон пошли!");
    }
}
