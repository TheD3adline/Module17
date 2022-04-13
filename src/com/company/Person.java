package com.company;

public class Person {

    private int age;

    public Person(int age) {
        this.age = age;
    }

    public void sprint() throws TooOldException { //This is how we resolved the problem from Part3 of this module. We created our own exception with TooOldException and set it up to be handed up instead of the mother-class Exception.
        if(this.age > 65) {
            throw new TooOldException();
        }
        System.out.println("Half age: " + (this.age / 0)); //With this change the ArithmeticException (RuntimeException) will be properly triggered again and show that this line of code tries to divide by 0
        System.out.println("The person sprints...");
    }
}
