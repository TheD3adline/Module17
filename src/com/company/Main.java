package com.company;

public class Main {

    public static void main(String[] args) throws Exception { //This throws Exception extension is required for the most basic form of exception, it "catches" the exception thrown from Person person1, delivers a message to console and stops the rest of the code.
                                                                //It is NOT needed if the exception is handled with a try/catch further down. There is nothing that needs to be passed further up.
        //Exceptions are customized deviations or special cases. At their most basic they kinda work like a constructor would with inheritance from higher classes and the super command.
        //They can be checked with for example an if statement within a method, in the basic setting stop the rest of the code from being executed and hand a customized or not message "up" into the class that executes the call.

        Person person1 = new Person(90);

        try { //This is a try/catch block, it can execute a method, and if the executed method throws a standard or custom exception, it catches it and executes the code within the catch(){} part, and then resumes with executing the code below the try/catch block.
            person1.sprint();
        } catch(Exception e) {
            System.out.println("The person is too old to sprint...");
        }

        System.out.println("test");

    }
}
