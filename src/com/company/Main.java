package com.company;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person(70);

        try {
            person1.sprint();
        } catch(TooOldException e) {
            System.out.println("Method sprint() can't be executed: " + e.getMessage()); //We can access the custom message in the try/catch of the call via the .getMessage() command
        } catch(ArithmeticException e) {
            System.out.println("Can't divide by 0 you donkey!");
        }

        System.out.println("test");

    }
}
