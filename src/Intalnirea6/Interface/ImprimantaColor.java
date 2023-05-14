package Intalnirea6.Interface;

public class ImprimantaColor implements Imprimanta, ImprimantaHD{
    @Override
    public void printeaza(String textDePrintat) {
        System.out.println("Am printat textul color: " + textDePrintat);
    }

    @Override
    public void printeazaHD(String text) {
        System.out.println("Am printat HD " +text);

    }
}
