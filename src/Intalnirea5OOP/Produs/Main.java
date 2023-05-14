package Intalnirea5OOP.Produs;

public class Main {
    public static void main(String[] args) {
        Produs paine = new Produs(4.7,3);
        double pretTotal = paine.pretTotal();
        System.out.println(pretTotal);
    }
}
