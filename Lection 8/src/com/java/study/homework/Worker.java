package com.java.study.homework;

public class Worker {
    private String name;
    private int age;
    private int sallary;

    public Worker(String name, int age, int sallary) {
        this.name = name;
        this.age = age;
        this.sallary = sallary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age=age;
    }

    public int getSallary() {
        return sallary;
    }

    public void setSallary(int sallary) {
        this.sallary = sallary;
    }
}
