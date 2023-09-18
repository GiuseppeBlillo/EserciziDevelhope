package eserciziJavaAdvanced.classiPerEsercizio9;

public class Rectangle extends Shape{
    public Rectangle (double x, double y) {
        this.height = x;
        this.width = y;
    }
        public double calculateArea(){
            return this.width*this.height;
        }

}
