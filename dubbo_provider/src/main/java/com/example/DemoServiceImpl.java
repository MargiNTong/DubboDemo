package com.example;

public class DemoServiceImpl implements DemoService{
    @Override
    public String sayHello(String name) {
        return "Hello," + name;
    }

    @Override
    public int Add(int param01, int param02) {
        return param01+param02;
    }
}
