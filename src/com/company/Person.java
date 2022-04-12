package com.company;

public class Person {

    private int age;

    public Person(int age) {
        this.age = age;
    }

    public void sprint() throws Exception {
        if(this.age > 65) {
            throw new Exception();
        }
        System.out.println("The person sprints...");
    }
}
