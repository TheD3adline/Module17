package com.company;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person(20);

        try {
            person1.sprint();
        } catch(TooOldException e) {
            System.out.println("The person is too old to sprint...");
        } catch(ArithmeticException e) { //We can extend the try/catch block with another catch condition, in this case we catch the ArithmeticException (a RuntimeException) and handle it
            System.out.println("Can't divide by 0 you donkey!"); //with this line. This will no longer lead to the program being terminated, and then execute the rest of the code instead.
        }

        System.out.println("test");

    }
}
