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
        System.out.println("Half age: " + (this.age / 0)); //This line introduces a new exception to deal with, since dividing by 0 is not possible and defined in Java this line throws a separate exception.
        System.out.println("The person sprints...");       //But since exceptions are different classes and subclasses, and we defined to throw a regular exception when checking the age condition above
    }                                                      //the method call in Main.java will also catch any exception, because we defined to do just that.
}
