package com.company;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person(70);

        try {
            person1.sprint();
        } catch(TooOldException e) {
            System.out.println("Method sprint() can't be executed: " + e.getMessage());
        } catch(ArithmeticException e) {
            System.out.println("Can't divide by 0 you donkey!");
        } finally { //The finally command allows us to execute code at the end of a try/catch block whether or not an exception was caught or not regardless
            System.out.println("Good Bye!");
        }

        System.out.println("test");

    }
}
