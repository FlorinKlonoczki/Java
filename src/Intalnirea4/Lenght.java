package Intalnirea4;

import java.util.Scanner;

public class Lenght {
    public static void main(String[] args) {
        String numeComplet = "Florin Silviu Klonoczki";
        int lungimeNume = numeComplet.length();
        System.out.println(lungimeNume);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti numele:");
        String nume = scanner.nextLine();

        if (nume.length() <=25) {
            System.out.println("Persoana cu numele " + nume + " se incadreaza la dosar");
        }else{
            System.out.println("Persoana cu numele " + nume + " nu se incadreaza la dosar");

        }
    }
}
