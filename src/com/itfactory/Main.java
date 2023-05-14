package com.itfactory;

import java.util.Scanner;

class Main {

    public static void main(String[] args){
        System.out.println("Introdu un nume: ");
        Scanner scanner = new Scanner(System.in);
        String nume = scanner.nextLine(); // introducem un string de la tastatura
        System.out.println("Bun venit," + nume);

    }
}

