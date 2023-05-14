package com.itfactory;

import java.util.Scanner;

public class intalnirea2 {
    public static void main(String[] args) {
        int termen1 = 5;
        int termen2 = -10;
        int suma = termen1 + termen2;

        System.out.println(suma);

        long numar1 = 2147483648L;
        long numar2 = 21474836L;
        long suma1 = numar1 - numar2;

        System.out.println(suma1);


        float floatVariable = 14.123456f;
        double doubleVariable = 14.123456;


        int numar3 = 10;
        int numar4 = 3;
        double impartire = numar3 / (double)numar4; //al doilea numar trebuie neaparat sa il setam ca double
        System.out.println(impartire);
        System.out.println("----------");
        boolean booleanVariable = true;
        boolean booleanVariable2 = false;

        char charVariable = 'a';
        System.out.println((int) charVariable); //o sa fie printat 97 din tabelul ASCII care corespunde cu char a.


        int intPrimitiv = 5;
        Integer intObject = 5;

        Scanner scanner = new Scanner(System.in);
        int numarDeLaTastatura = Integer.parseInt("123");

        double numarDeLaTastatura1 = Double.parseDouble(scanner.nextLine());
        System.out.println(numarDeLaTastatura1);


    }
}
