package eserciziJavaAdvanced;

import java.util.HashMap;
import java.util.Map;

public class esercizio2 {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
    }

    /**
     * 1: Follow the steps below
     */
    private static void exercise1() {
        System.out.println("\nExercise 1:");
        // 1a. Create a map of integers to strings
        Map<Integer, String> myFirstMap = new HashMap<>();

        // 1b. Add 3 elements to the map .put

        myFirstMap.put(1, "hello");
        myFirstMap.put(2, "world");
        myFirstMap.put(3, "!");

        // 1c. Print the map

        System.out.println(myFirstMap);

        // 1d. Access an element in the map with .get

        System.out.println(myFirstMap.get(1));

        // 1e. Remove an element from the map .remove

        myFirstMap.remove(3);

        // 1f. Print the map again to confirm the element was removed

        System.out.println(myFirstMap);
    }

    /**
     *  2: Follow the instructions in the code
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");
        Map<String, Double> menuCostsInEuro = new HashMap<>();

        menuCostsInEuro.put("Fries", 3.50);
        menuCostsInEuro.put("Pizza", 11.80);
        menuCostsInEuro.put("Burger", 8.50);

        String mostExpensiveMenuItemName = null;

        // 2a. Loop over the map entries with menuCostsInEuro.entrySet()
        //     and set out the most expensive items name
        //     use for(Map.Entry<String, Double> entry : menuCostsInEuro.entrySet()) and entry.getKey and entry.getValue
        //     to do so

        double x = 0;

        for(Map.Entry<String, Double> entry : menuCostsInEuro.entrySet())  {
            if (entry.getValue()> x) {
                mostExpensiveMenuItemName = entry.getKey();
                x = entry.getValue();
            }
        }

        System.out.println(mostExpensiveMenuItemName);

        // Your code

        if (mostExpensiveMenuItemName.equals("Pizza")) {
            System.out.println("2a. Correct!");
        } else {
            System.out.println("2a. Incorrect!");
        }
    }

    /**
     * 3: Follow the instructions in the code
     */
    private static void exercise3() {
        System.out.println("\nExercise 3:");
        Map<String, Integer> fruitWeights = new HashMap<>();

        fruitWeights.put("Apple", 5);
        fruitWeights.put("Banana", 3);
        fruitWeights.put("Orange", 8);
        fruitWeights.put("Kiwi", 1);
        fruitWeights.put("Mango", 4);
        fruitWeights.put("Grapes", 8);
        fruitWeights.put("Peach", 5);
        fruitWeights.put("Pineapple", 1);

        int totalWeight = 0;
        // 3a. Use a for loop with fruitWeights.values() and sum up the total weight

        for(Map.Entry<String, Integer> i : fruitWeights.entrySet()) {
            totalWeight += i.getValue();
        }
        // Your code

        if (totalWeight == fruitWeights.values().stream().mapToInt(Integer::intValue).sum()) {
            System.out.println("3. Correct!");
        } else {
            System.out.println("3. Incorrect!");
        }
    }
}

