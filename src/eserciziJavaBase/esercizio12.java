package eserciziJavaBase;

import java.util.ArrayList;

public class esercizio12 {
    public static void main(String[] args) {
    exercise1();
    exercise2();
    exercise3();
}

    /**
     * 1: Add 8 random integers to the array list
     * <p>
     * Print out the first item
     * <p>
     * Remove the first 3 items
     * <p>
     * The print out the first remaining item
     */
    public static void exercise1() {
        System.out.println("Exercise 1:");
        ArrayList<Integer> numbers = new ArrayList<>();

        //Write your code here
        numbers.add (1);
        numbers.add (2);
        numbers.add (3);
        numbers.add (4);
        numbers.add (5);
        numbers.add (6);
        numbers.add (7);
        numbers.add (8);

        System.out.println(numbers.get(0));

        numbers.remove(0);
        numbers.remove(0);
        numbers.remove(0);

        System.out.println(numbers.get(0));

    }

    /**
     * 2: Create 2 Array Lists,
     * <p>
     * A list of strings called 'menuItems'
     * <p>
     * And a list of Doubles called 'menuPrices'
     * <p>
     * The indexes of these two lists correspond to eachother
     * <p>
     * Create a print statement to output the name and price of each
     * menu item correspond
     */
    public static void exercise2() {
        System.out.println("\nExercise 2:");

        //Write your code here
        ArrayList<String> menuItems = new ArrayList<>();
        ArrayList<Double> menuPrices = new ArrayList<>();

        menuItems.add ("pizza margherita");
        menuItems.add ("pizza romana");
        menuItems.add ("pizza bufala");
        menuItems.add ("pizza capricciosa");
        menuItems.add ("pizza diavola");

        menuPrices.add (4.5);
        menuPrices.add (5.0);
        menuPrices.add (7.0);
        menuPrices.add (6.0);
        menuPrices.add (5.5);

        System.out.print("Per una " + menuItems.get(0) + " il prezzo è " + menuPrices.get(0)+"€,");
        System.out.print(" per una " + menuItems.get(1) + " il prezzo è " + menuPrices.get(1)+"€,");
        System.out.print(" per una " + menuItems.get(2) + " il prezzo è " + menuPrices.get(2)+"€,");
        System.out.print(" per una " + menuItems.get(3) + " il prezzo è " + menuPrices.get(3)+"€,");
        System.out.println(" per una " + menuItems.get(4) + " il prezzo è " + menuPrices.get(4)+"€.");

    }

    /**
     * 3: I changed this to an int array after recording!
     * <p>
     * You'll still need to find the total but using [index] instead of .get(index)
     * <p>
     * Find the total sum of all items in the ArrayList below.
     * <p>
     * Use the + operator
     * <p>
     * print the total
     */
    public static void exercise3() {
        System.out.println("\nExercise 3:");
        int[] items = new int[]{5, 10404, -234348, -53, 9, 91, 92, 34534, 12334, 1435};

        //Write your code here
        int sum =0;
        for (int i=0; i<items.length; i++){
            sum += items[i];
        }
        System.out.println(sum);
    }
}
