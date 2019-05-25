package com.hzq;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ProviderFirst {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider-first.xml");
        System.out.println(context.getDisplayName() + ": here");
        context.start();
        System.out.println("ProviderFirst 服务已经启动...");
        System.in.read();
    }

}
