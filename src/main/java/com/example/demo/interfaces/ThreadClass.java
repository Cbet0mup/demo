package com.example.demo.interfaces;

import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@NoArgsConstructor
public class ThreadClass implements MyInterface{

    private MyInterface myInterface;

    public ThreadClass(MyInterface myInterface) {
        this.myInterface = myInterface;
    }

    public String go() {
        return myInterface.doSomthing();
    }

    @Override
    public String doSomthing() {
        return "dfdhfh;dlkfh;ldfhm;dlfmh;ldfmh;ldmf;hldmfh;ldmhlf;";
    }
}
