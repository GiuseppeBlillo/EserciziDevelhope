package eserciziJavaBase.classiPerEsercizio18;

public class Student {
    String name;
    int age;
    public Student(String name, int age){
        System.out.println("Constructing, please wait...");
        System.out.println(name+" ("+age+")");
        System.out.println("Constructed!");
        this.name = name;
        this.age = age;
    }
    public Student(int age){
        this.age = age;
    }
    public Student(String name){
        this.name = name;
    }
    public Student(){}
}