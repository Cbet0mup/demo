package com.example.demo.interfaces;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@NoArgsConstructor
public class ThreadClass {

    private MyInterface myInterface;

    public ThreadClass(MyInterface myInterface) {
        this.myInterface = myInterface;
    }

    public String go() {
        return myInterface.doSomthing();
    }

}
