package Intalnirea5OOP.servicii;

import Intalnirea5OOP.Persoana;

public class Main {
    public static void main(String[] args) {
        Persoana dragosRoban = new Persoana("Dragos","Roban",1902222122222L);
        Persoana corinaCostea = new Persoana("Corina","Costea",1902222166566L);

//        dragosRoban.vorbeste();
//        corinaCostea.vorbeste();

//        String numeComplet = dragosRoban.numeComplet();
//        System.out.println(numeComplet);
//
//        String numeComplet1 = corinaCostea.numeComplet();
//        System.out.println(numeComplet1);
        System.out.println(dragosRoban.getPrenume());

        dragosRoban.setPrenume("Piatra");
        System.out.println(dragosRoban.getPrenume());


    }
}
