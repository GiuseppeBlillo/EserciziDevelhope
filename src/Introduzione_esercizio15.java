import java.util.Arrays;
import java.util.List;

public class Introduzione_esercizio15 {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Take the code below and put it into a function, read the code and see what it is.
     * <p>
     * What do you think the function does? Name the function appropriately and make sure
     * <p>
     * return the appropriate result type
     *
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");

        // Put this into a function
        double celsius = 42;
        System.out.println(conversion(celsius));
        }
        private static String conversion(double celsius){
            double fahrenheit = ((celsius * 9) / 5) + 32;
            String conversionDescription = celsius + " Celsius is " + fahrenheit + " fahrenheit";
        return conversionDescription;
        // End
    }



    /**
     * 2: Create a function that processes and prints out all the names in the ArrayList
     *
     *    Make sure to put all the formatting code in the function, formatting:
     *    1) to Upper case
     *    2) Remove spaces at the start and the end
     *    3) If the name contains any numbers, instead of returning the name, return "Invalid"
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        List<String> names = Arrays.asList("Alan   ", "Alice   ", "Ant0ni0   ", "  Aziz");

        for (String name : names) {
            System.out.println(checkName(name));
            // Call your function
        }
    }
    private static String checkName(String name) {
        for (int i = 0; i < name.length(); i++) {
            if (Character.isDigit(name.charAt(i))) {
                return "Invalid";
            }
        }
        return name.trim().toUpperCase() ;
    }

    /**
     * 3: Write a function that prints out every variable seen in the code. It should not return anything
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        
        lunch();
    }
    // Call your function
        private static void lunch() {
            String lunchType = "sandwich";
            double myLunchPrice = 5.99;
            String description = "nice big sandwich";
            int weightInGrams = 500;
            String info = "I'll got a "+ lunchType + " and it costs " +myLunchPrice +"€, " + "it is a "+ description +" because its weight is "+ weightInGrams + " grams.";
            System.out.println(info);;
        }
}
