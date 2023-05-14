package Intalnirea5OOP.Produs;

public class Produs {
    private double pret;
    private int cantitate;

    public Produs(double pret, int cantitate) {
        this.pret = pret;
        this.cantitate = cantitate;

    }

    public double pretTotal(){

        return pret * cantitate;
    }
}
