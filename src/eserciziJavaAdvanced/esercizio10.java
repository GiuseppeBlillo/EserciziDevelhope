package eserciziJavaAdvanced;

import eserciziJavaAdvanced.classiPerEsercizio10.Person;

public class esercizio10 {public static void main(String[] args) {
    exercise1();
    exercise2();
}
    /**
     * 1:
     *
     *
     * Create a class called "Person" with fields for name, age, and address.
     *
     * Override the `toString()` method in the Person class to display the object's name, age, and address in a user-friendly format.
     *
     * Create instances of the Person class and print them using the overridden `toString()` method.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        Person p1 = new Person("Giovanni" , 23, "Piazza Libertà");
        System.out.println(p1);
        // Your code here
    }

    /**
     * 2:
     *
     *
     * Override the `hashCode()` method in the Person class to generate a unique hash code based on the object's name, age, and address.
     *
     * You can achieve this by using String.hashCode() to convert strings to ints and adding the fields together
     *
     * Create 2 people and print out their hashcodes
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Person p2 = new Person("Giacomo", 25, "Via Roma");
        Person p3 = new Person("Matteo", 27, "Via Cavour");

        System.out.println(p2.hashCode());
        System.out.println(p3.hashCode());
    }

    /**
     * 3:
     *
     * BONUS: Read about the nuances of hashcodes here:
     *
     * https://www.baeldung.com/java-hashcode
     *
     * Don't necessarily expect to understand it all right away, it can get quite complicated
     *
     */
}
