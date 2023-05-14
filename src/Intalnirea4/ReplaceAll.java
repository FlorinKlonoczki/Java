package Intalnirea4;

import java.util.Scanner;

public class ReplaceAll {
    public static void main(String[] args) {
        String mesaj = "Draga nume te felicit si iti urez la multi ani! nume";
        String mesajReplace = mesaj.replaceAll("nume","Florin");
        System.out.println(mesajReplace);

        System.out.println(mesaj.replaceFirst("nume","Florin"));

        String mesaj1 = "Suntem la cursul de Java";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti cu ce schimbati: ");
        String value = scanner.nextLine();

        String mesaj2 = mesaj1.replaceAll("Java", value);
        System.out.println(mesaj2);
    }
}
