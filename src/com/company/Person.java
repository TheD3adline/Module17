package com.company;

public class Person {

    private int age;

    public Person(int age) {
        this.age = age;
    }

    public void sprint() throws TooOldException {
        if(this.age > 65) {
            throw new TooOldException("The person is older than 65, this person is just too old to sprint!");
        }
        System.out.println("Half age: " + (this.age / 0));
        System.out.println("The person sprints...");

    }
}
