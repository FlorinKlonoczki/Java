package Intalnirea4;

import java.util.Locale;
import java.util.Scanner;

public class LowerUpper {
    public static void main(String[] args) {
        String mesaj = "asdsdsadsadsads";
        String mesajLowerCase = mesaj.toLowerCase();


        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti nume: ");
        String nume = scanner.nextLine();

        if(nume.toLowerCase().equals("Florin Klonoczki".toLowerCase())){
            System.out.println("Ai castigat la loto!");
        }
//        if(nume.equalsIgnoreCase("Florin Klonoczki")){
//            System.out.println("Ai castigat la loto!");
//        }         // este acelas rezultata ca cea de mai sus
    }
}
