package com.company;

public class Person {

    private int age;

    public Person(int age) {
        this.age = age;
    }

    public void sprint() throws Exception { //this is the extension of the method required to throw the standard or customized exception
        if(this.age > 65) { //condition to check if the exception applies, if it applies it throws the standard or customized exception and stops the execution of the rest of the code
            throw new Exception(); //most basic form of exception, the standard that is part of the basic Java toolset, stops rest of code if triggered
        }
        System.out.println("The person sprints...");
    }
}
