package eserciziJavaAdvanced.classiPerEsercizio9;

public class Guitar extends Instrument implements Playable{
    public Guitar(String name, String brand) {
        super(name, brand);
    }

    @Override
    public void play() {
        System.out.println("It's rock and roll time, baby! :D");
    }
}
