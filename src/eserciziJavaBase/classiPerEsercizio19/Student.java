package eserciziJavaBase.classiPerEsercizio19;

public class Student {
    private String name;
    private int age;
    private String surname;
    private char initial;
    private String city;
    private String test;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ((name != null) && (!name.equals("")) && (name.matches("^[a-zA-Z]*$"))) {
            this.name = name;
        } else this.name = "not a valid name";
    }

    public String getAge() {
        if ((age < 0 ^ age > 120)) {
            return "Insert a valid age";
        } else return String.valueOf(age);
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSurname() {
        if ((surname != null) && (!surname.equals("")) && (surname.matches("^[a-zA-Z]*$"))) {
            return surname;
        } else return "not a valid surname";
    }

    public void setSurname(String surname) {
        if ((surname != null) && (!surname.equals("")) && (surname.matches("^[a-zA-Z]*$"))) {
            this.surname = surname;
        } else this.surname = "Insert a valid surname";
    }

    public char getInitial() {
        return initial;
    }

    public void setInitial(char initial) {
        if (initial == name.charAt(0)) {
            this.initial = initial;
        }
    }

    public String getCity() {
        if ((city != null) && (!city.equals("")) && (city.matches("^[a-zA-Z]*$"))) {
            return city;
        } else return "not a valid city";
    }

    public void setCity(String city) {
        if ((city != null) && (!city.equals("")) && (city.matches("^[a-zA-Z]*$"))) {
            this.city = city;
        } else this.city = "not a valid city";
    }

    public String getTest(int age) {
        if (age < 18) {
            test = "underage";
        } else test = "an adult";
        return test;
    }

    public void printNow() {
        if (getCity() != city || getInitial() != initial || getName() != name || getSurname() != surname) {
            System.out.println("I can't create a suitable sentence, sorry :D");
        } else
            System.out.println("Hi, I'm " + getName() + " " + getSurname() + " and I come from " + getCity() + ". I'm " + getAge() + " years old, so I'm " + getTest(age) + ".");
    }

}
