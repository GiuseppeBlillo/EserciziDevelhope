package eserciziJavaAdvanced;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.MathContext;

public class esercizio11 {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1:
     *
     *
     * In the main method, create a variable x as a random number between 0-100 using Math.random() * 100;
     *
     * Use a ternary operator to check if x is greater than or equal to 50. If it is, print "x is greater than or equal to 50". If it's not, print "x is less than 50".
     *
     * Experiment with different values of x and observe the output
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        System.out.println(Math.random()*100 > 50 ? "x is greater than or equal to 50" : "x is less than 50");
        // Your code here
    }



    /**
     * 2:
     *
     *
     * Create a record called "Person" with fields for name, age and address.
     *
     * Add a toString method to Person to print out the data in a different format
     *
     * Print the record to the console
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        Person p1 = new Person("Mario", 19 , "piazza Grande");
        System.out.println(p1.toString());
        // Your code here
    }
    record Person(String x, int y, String z){
        public String toString(){
            return "Name is " + x + " and age is " + y + ". The address is " + z;
        }
    }
    /**
     * 3:
     *
     *
     * In the main method, create a BigInteger variable with a large value.
     *
     * Create a BigDecimal variable with a large value
     *
     * Divide the BigInteger by 3 using the divide method and assign the result to a new BigInteger variable
     *
     * Divide the BigDecimal by Math.PI using the divide method and assign the result to a new BigDecimal variable
     *
     * Print the results
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        BigInteger y = new BigInteger("2000000000000000000000000000000000");
        BigDecimal z = new BigDecimal("0.000000000000000000000000004");
        BigInteger y1 = y.divide(new BigInteger("3"));
        BigDecimal z1 = z.divide(new BigDecimal(Math.PI), MathContext.DECIMAL64);
        System.out.println(y1);
        System.out.println(z1);
        // Your code here
    }
}
