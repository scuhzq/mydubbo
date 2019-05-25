package com.hzq;

public class DemoService implements IDemoService{

    public String sayHello(String name) {
        return "Hello " + name;
    }
}
