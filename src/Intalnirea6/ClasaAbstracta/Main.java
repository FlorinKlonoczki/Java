package Intalnirea6.ClasaAbstracta;

public class Main {
    public static void main(String[] args) {
        SchimbValutar rocri = new Rocri();// aici nu putem initializa SchimbValutar ,
        //putem initializa o subclasa
        SchimbValutar schimbBt = new SchimbBt();

        System.out.println(rocri.schimbaBaniInRon(100));
        System.out.println(schimbBt.schimbaBaniInRon(100));
    }
}

