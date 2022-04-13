package com.company;

public class Person {

    private int age;

    public Person(int age) {
        this.age = age;
    }

    public void sprint() throws TooOldException {
        if(this.age > 65) {
            throw new TooOldException("Person is older than 65, person can't sprint at this age anymore!");
        }
        System.out.println("Half age: " + (this.age / 0));
        System.out.println("The person sprints...");
    }
}
