public class esercizio6 {
    public static void main(String[] args) {
        exercise1();
        exercise2();
        exercise3();
        exercise4();
        exercise5();
    }

    private enum YouCanUseClassLocalEnumsLikeThis {
        THIS_CAN_ONLY_BE_ACCESSED_IN_THIS_CLASS,
        THIS_TOO
    }

    /**
     * 1:
     *
     *
     * Create an enum called "Days" with the values "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY", "SUNDAY".
     *
     * Loop over the values with Days.values() and print them out.
     */
    private static void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        for (Days x : Days.values()){
            System.out.println(x);
        }
    }
    private enum Days {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }

    /**
     * 2:
     *
     *
     * Create an enum called "Seasons" with the values "SPRING", "SUMMER", "FALL", "WINTER".
     *
     * Write a method that takes a Seasons value as input and returns the corresponding date range of months in that season.
     *
     */
    private static void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        System.out.println(Seasons.Spring.getMonths());
    }

    private enum Seasons{
        Spring ("March to June"),
        Summer("June to September"),
        Autumn("September to December"),
        Winter("December to March");

        private String months;
        Seasons(String months){
            this.months=months;
        }
        public String getMonths(){
            return months;
        }
    }

    /**
     * 3:
     *
     *
     * Create an enum called "TrafficLight" with the values "RED", "YELLOW", "GREEN".
     *
     * Write code that simulates the behavior of a traffic light. It should take the current state of the traffic light as input and return the next state.
     *
     */
    private static void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        TrafficLight lightNow = TrafficLight.Green;

        lightNow = lightNow.changLight(lightNow);
        System.out.println(lightNow);


    }
    private enum TrafficLight{
        Red, Green, Yellow;

        public TrafficLight changLight(TrafficLight trafficLight){
            if (trafficLight == TrafficLight.Red){
                try{
                    System.out.print("Changing light in green");
                    Thread.sleep(2000);
                    System.out.print(".");
                    Thread.sleep(1000);
                    System.out.print(".");
                    Thread.sleep(1000);
                    System.out.print(".");
                    Thread.sleep(1000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                    System.exit(0);
                }
                return TrafficLight.Green;
            } else if (trafficLight == TrafficLight.Green) {
                try {
                    System.out.print("Changing light in yellow");
                    Thread.sleep(2000);
                    System.out.print(".");
                    Thread.sleep(1000);
                    System.out.print(".");
                    Thread.sleep(1000);
                    System.out.print(".");
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.exit(0);
                }
                return TrafficLight.Yellow;
            }else if (trafficLight == TrafficLight.Yellow){
                try {
                    System.out.print("Changing light in red");
                    Thread.sleep(2000);
                    System.out.print(".");
                    Thread.sleep(1000);
                    System.out.print(".");
                    Thread.sleep(1000);
                    System.out.print(".");
                    Thread.sleep(1000);
                } catch (InterruptedException e){
                    e.printStackTrace();
                    System.exit(0);
                }
                return TrafficLight.Red;
            }
            return trafficLight;
        }

    }



    /**
     * 4:
     *
     * Given the Days enum from exercise 1, add a local field called isWeekend and set it to true for the weekend days and false for the weekdays.
     *
     * Write an if statement that prints weekend or weekday based on the enum
     */
    private static void exercise4() {
        System.out.println("\nExercise 4: ");
        // Your code here
        Days question = Days.WEDNESDAY;
        if (question == Days.SATURDAY^ question == Days.SUNDAY){
            System.out.println("Yes, it's a weekend");
        } else System.out.println("nope, its's a weekday");

        System.out.println(question);

    }

    /**
     * 5:
     *
     *
     * Create an enum called "Operator" with the values "ADD", "SUBTRACT", "MULTIPLY", "DIVIDE".
     *
     * Write a method that takes two integers and an Operator value as input, performs the corresponding operation on the integers, and returns the result.
     */
    private static void exercise5() {
        System.out.println("\nExercise 5: ");
        // Your code here

        double num1 = 5;
        double num2 = 2;

        System.out.println(Operator.ADD.calculator(num1, num2));
    }

    private enum Operator{
        ADD, SUBSTRACT, MULTIPLY, DIVIDE;

        double calculator(double x, double y){
            double result = 0;
            switch (this){
                case ADD -> result = x+y;
                case DIVIDE -> result= x/y;
                case MULTIPLY -> result =x*y;
                case SUBSTRACT -> result= x-y;
            }
         return result;
        }
    }
}
