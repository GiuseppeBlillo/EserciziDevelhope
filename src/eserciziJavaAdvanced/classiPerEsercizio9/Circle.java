package eserciziJavaAdvanced.classiPerEsercizio9;


public class Circle extends Shape {
    public Circle(double x) {
        this.height= x;
    }

    public double calculateArea(){
        return (this.height*this.height)*3.14;
    }

}
