package com.company;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person(70);

        try {
            person1.sprint();
            System.out.println("Good Bye!"); //If we want to execute another line after the original one in try it only works if the first line passes all exception tests that we have set up.
        } catch(TooOldException e) { //We could also try another method of course.
            System.out.println("Method sprint() can't be executed: " + e.getMessage());
        } catch(ArithmeticException e) {
            System.out.println("Can't divide by 0 you donkey!");
        }

        System.out.println("test");

    }
}
