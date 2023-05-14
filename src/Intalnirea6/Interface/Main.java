package Intalnirea6.Interface;

public class Main {
    public static void main(String[] args) {
        Imprimanta imprimantaAlbNegru = new ImprimantaAlbNegru();

        Imprimanta imprimantaColor = new ImprimantaColor();

        imprimantaAlbNegru.printeaza("text");

        imprimantaColor.printeaza("text");

    }
}
