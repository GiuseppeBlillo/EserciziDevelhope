package eserciziJavaAdvanced.classiPerEsercizio10;

public class Person {
    String name;
    int age;
    String address;

    public Person(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "My name is " + getName() + " and I'm " + getAge() + " years old. I live in "+ getAddress();
    }

    @Override
    public int hashCode() {
         return getAge()*getName().hashCode()*getAddress().hashCode();
    }
}