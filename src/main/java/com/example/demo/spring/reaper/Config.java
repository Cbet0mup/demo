package com.example.demo.spring.reaper;

public interface Config {
    <T> Class<? extends T> getImplClass(Class<T> ifc);
}
