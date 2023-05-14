package Intalnirea6.Interface;

public class ImprimantaAlbNegru implements Imprimanta{
    //           clasa                     interfata care se implementeaza

    @Override //anotare - o metadata, este o metoda suprascrisa
    public void printeaza(String textDePrintat) {
        System.out.println("Am printat non-color textul: " + textDePrintat );

    }
}
