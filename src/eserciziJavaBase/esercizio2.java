package eserciziJavaBase;

public class esercizio2 {
    public static void main(String[] args) {
    exercise1();
    exercise2();
    exercise3();
}

    /**
     * 1: print out your initials using System.out.print and then a char literal,
     * i.e. 'a', 'b', 'c'. You will need multiple print statements
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        System.out.println("G");
        System.out.println("B");
    }

    /**
     * 2: Print out your age as an int literal, i.e. 28, then print whether or not you've
     * had lunch today as a boolean literal i.e. true, false, then print the price of
     * your lunch as a double, i.e. 4.99
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        // Write your code here
        System.out.println(30);
        System.out.println(true);
        System.out.println(3.50);
    }

    /**
     * 3: Complete exercise 2, but store the values in a variable.
     * And then print out the variable.
     *
     * i.e.
     * char favouriteLetter = 'g';
     * System.out.print("My favourite letter=");
     * System.out.println(favouriteLetter)
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        // Write your code here
        int age = 30;
        boolean hadLunchToday = true;
        double lunchPrice = 3.50;

        System.out.println("My age is");
        System.out.println(age);

        System.out.println("Did I had lunch today?");
        System.out.println(hadLunchToday);

        System.out.println("My lunch price=");
        System.out.println(lunchPrice);
    }
}
