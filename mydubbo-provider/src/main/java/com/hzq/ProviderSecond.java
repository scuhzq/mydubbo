package com.hzq;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class ProviderSecond {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("provider-second.xml");
        System.out.println(context.getDisplayName() + ": here");
        context.start();
        System.out.println("ProviderSecond 服务已经启动...");
        System.in.read();
    }

}
