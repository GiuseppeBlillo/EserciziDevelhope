public class introduzione_esercizio3 {
    public static void main(String[] args) {
    exercise1();
    exercise2();
    exercise3();

}

    /**
     * 1: Store your age in an appropriate variable, print it out in
     *    one line using the "+" in your print statement. Only use 1 print statement
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        // Write your code here
        int myAge = 30;
        System.out.print("My age is " + myAge);
    }

    /**
     * 2: Store your first name initial (i.e. Jane -> J) in a variable, your age in another variable.
     *
     *    And then print them out on the same line using the following idea
     *
     *    System.out.println("My Age=" + myAge +", my initial=" + myInitial);
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        //Write your code here
        char myInitial = 'G';
        int myAge = 30;
        System.out.println("My age is "+ myAge + " and my initial is " + myInitial);

    }

    /**
     * 3: Write comments above each line of code, describing what the line of code is doing
     */


    // here you just set a new exercise (in this case) as part of your code to run
    private static void exercise3() {
        // here you tell the code to print "Exercise 3"
        System.out.println("\nExercise 3:");
        // here you set a boolean value as a new variable
        boolean hasEatenLunch = false;
        //here you set a decimal number as a new variable for the price of the lunch
        double lunchCost = 5.99;
        //finally you tell the code to print each variables value and, before them, a little string to describe it
        System.out.println("Lunch cost=" + lunchCost);
        System.out.println("Has Eaten lunch=" + hasEatenLunch);
    }
}
