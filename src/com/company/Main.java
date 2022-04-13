package com.company;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person(20);

        try {
            person1.sprint();
        } catch(TooOldException e) {
            System.out.println("The person is too old to sprint...");
        }

        System.out.println("test");

    }
}
