package com.company;

public class Main {

    public static void main(String[] args) {


        Person person1 = new Person(70);

        try {
            person1.sprint();
        } catch(TooOldException e) {
            System.out.println("Person is too old for this shit...");
        } catch(ArithmeticException e) {
            System.out.println("Can't divide by 0 you donkey!");
        }

        System.out.println("Bla");


        /*
        int[] array = new int[5];

        try {
            for(int i = 0; i <= 5; i++) {
                array[i] = i;
            }
        } catch(ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        */
    }
}
