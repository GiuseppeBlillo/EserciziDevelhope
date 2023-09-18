package eserciziJavaBase;

import eserciziJavaBase.classiPerEsercizio17.Course;
import eserciziJavaBase.classiPerEsercizio17.Student;

import java.util.Arrays;
import java.util.List;

public class esercizio17 {public static void main(String[] args) {
    Course course = new Course();
    exercise1(course);
    exercise2();
    exercise3(course);
}

    /**
     * 1: Create a new Class in this package
     *
     *    Call this class 'Course'
     *
     *    Inside add the following variables, using an appropriate type.
     *    courseName, maxStudents, qualityRatingOutOf10
     *
     *    On top of this choose 2 variables of your choice!
     */



    private static void exercise1(Course course){
        System.out.println("The new course '"+course.courseName +"' has "+ course.maxStudents + " students!");
    }




    /**
     * 2: use the class called 'Student', add variables
     *    (class variables are called 'fields' or 'attributes')
     *    called 'name' and 'age'
     *
     *    Using the function below set the student name and ages
     *
     */
    private static void exercise2() {
        System.out.println("Exercise 2:");
        List<String> studentNames = Arrays.asList("Alice", "Aragon", "Alex");
        List<Integer> studentAges = Arrays.asList(23, 31, 38);

        // Use a for i loop
        for (int i=0; i<studentNames.size(); i++){
            Student student =createNewStudent(studentNames.get(i), studentAges.get(i));
            System.out.println(student.name + "(age "+student.age + ")");
        }
    }

    private static Student createNewStudent(String name, Integer age) {
        Student student = new Student();
        // Write your code here
        student.name = name;
        student.age = age;

        return student;
    }

    /*
     * 3: Finally lets edit our 'EserciziJavaBase.ClassiPerEsercizio17.Course' class once more,
     *
     *    This time we are going to add another internal variable (field or attribute) called
     *    students. It's going to be a List<EserciziJavaBase.ClassiPerEsercizio17.Student> called students
     *
     *    Copy the code above and add the students from exercise 2
     *
     *    Bonus: Using an appropriate loop of your choice find the average age of our students.
     *
     *    Hint: use a double to stop automatic integer rounding
     */

    private static void exercise3(Course course) {
        System.out.println("\nExercise 3:");
        double maxAge=0;
        for (int age : course.studentAges){
            maxAge+= age;
        // Write your code here
        }
        double averageAge = maxAge / course.studentAges.size();
        System.out.println("the motherfucking average age is " + Math.round(averageAge));
    }
}
