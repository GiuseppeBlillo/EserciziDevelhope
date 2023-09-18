package eserciziJavaBase;

import eserciziJavaBase.classiPerEsercizio19.Student;

public class esercizio19 {
    public static void main(String[] args) {
        exercise1();
        exercise2();
    }
    /**
     * 1: Copy over the student class
     *
     *    Make sure there are 5 fields inside, if they are not simply create some more.
     *    make every field private first.
     *
     *    Then create getters and setters for each of these 5 fields.
     *
     *    Once ready use all 5 below
     */
    private static void exercise1() {
        System.out.println("Exercise 1:");
        Student newS = new Student();
        newS.setName("Giuann");
        newS.setAge(19);
        newS.setInitial('G');
        newS.setCity("Napoli");
        newS.setSurname("Brambilla");

        System.out.println(newS.getName());
        System.out.println(newS.getCity());
        System.out.println(newS.getInitial());
        System.out.println(newS.getSurname());
        System.out.println(newS.getAge());

        // or better

        newS.printNow();

        // Write and use your 5 getters and setters!
    }


    /**
     * 2: Create 3 setter constraints for the student class
     *
     *    Think about what reasonably constraints are?
     *
     *    Should a student be able to be a negative age?
     *
     *    Create a counter for one of the getters, try to think about
     *    what other code could be inside a getter? Why not write it?
     */
    private static void exercise2() {
        System.out.println("\nExercise 2:");

        Student giacomo = new Student();

        giacomo.setName("gi@como");
        giacomo.setCity("mil@no");
        giacomo.setInitial('k');
        giacomo.setAge(-9);

        System.out.println(giacomo.getName());
        System.out.println(giacomo.getCity());
        System.out.println(giacomo.getInitial());
        System.out.println(giacomo.getAge());
        //Write your code here
    }
}
