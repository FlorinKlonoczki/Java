package Intalnirea6.ClasaAbstracta;

public abstract class SchimbValutar {
    abstract double cursDeSchimbEuro();

    public double schimbaBaniInRon(double euro) {
        return euro * cursDeSchimbEuro();
    }
}
