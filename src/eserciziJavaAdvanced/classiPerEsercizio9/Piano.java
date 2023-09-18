package eserciziJavaAdvanced.classiPerEsercizio9;

public class Piano extends Instrument implements Playable {
    public Piano(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void play() {
        System.out.println("It's jazz time, baby! :D");
    }
}
