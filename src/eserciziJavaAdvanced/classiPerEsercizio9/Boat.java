package eserciziJavaAdvanced.classiPerEsercizio9;

public class Boat implements Movable{
    @Override
    public void moveForward(int x) {
        System.out.println( "I'm moving forward with a speed of " + x + " knots :D");
    }

    @Override
    public void moveBackward(int x) {
        System.out.println( "I'm moving backward with a speed of " + x + " knots :D");
    }
}
