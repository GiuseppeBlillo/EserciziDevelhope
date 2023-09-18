import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class esercizio7 {

    /**
     * 1:
     *
     *
     * Create JUnit test for the add() and subtract() methods in the Calculator class.
     *
     * Test the methods with multiple test cases, including positive and negative numbers, and zero.
     *
     * Verify that the methods return the correct result for each test case.
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     */
    @Test
    void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Calcolatrice calculator = new Calcolatrice();
        Assertions.assertTrue(calculator.add(5 , 4) == 9);
        Assertions.assertTrue(calculator.subtract(5 , 4) == 1);
        Assertions.assertTrue(calculator.add(5 , -4) == 1);
        Assertions.assertTrue(calculator.subtract(-5 , 4) == -9);
        Assertions.assertTrue(calculator.add(-5 , 0) == -5);
        Assertions.assertTrue(calculator.subtract(0 , 4) == -4);


    }

    /**
     * 2:
     *
     *
     * Create JUnit test for the multiply() and divide() methods in the Calculator class.
     *
     * Test the same kind of inputs as before as exercise 1
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     *
     */
    @Test
    void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here

        Calcolatrice calculator = new Calcolatrice();

        Assertions.assertTrue(calculator.divide(-5 , 4) == -1.25);
        Assertions.assertTrue(calculator.multiply(-5 , 4) == -20);
        Assertions.assertTrue(calculator.multiply(0 , 4) == 0);
        Assertions.assertTrue(calculator.divide(0 , 4) == 0);
        Assertions.assertTrue(calculator.multiply(-5 , 0) == 0);

        Assertions.assertEquals(calculator.divide (5,0), Double.POSITIVE_INFINITY);

        Assertions.assertDoesNotThrow( () -> calculator.divide(10, 0)); // ????

    }
     /**
     * 3:
     *
     * Create a JUnit test for the power() method in the Calculator class that raises a number to a power.
     * Test the method with test cases where the base is zero, positive, and negative - the exponent is zero, one and negative
     * Test with decimals too!
     * Verify that the method returns the correct result for each test case.
     *
     * If there is an error you may have to change the code in Calculator to fix it!
     *
     * Don't just write tests that use the result of the program as the expected!!
     */
    @Test
    void exercise3() {
        System.out.println("\nExercise 3: ");

        Calcolatrice calculator = new Calcolatrice();

        Assertions.assertTrue(calculator.power(3 , 2) == 9);
        Assertions.assertTrue(calculator.power(2 , 3) == 8);
        Assertions.assertTrue(calculator.power(0 , 5) == 0);
        Assertions.assertTrue(calculator.power(3 , 0) == 1);
        Assertions.assertTrue(calculator.power(-3 , 2) == 9);
        Assertions.assertTrue(calculator.power(3 , 1) == 3);
        Assertions.assertTrue(calculator.power(3.5 , 2) == 12.25);

        // Your code here
    }
}
