package Intalnirea8;

import Intalnirea5OOP.Persoana;

import java.util.HashMap;
import java.util.*;

public class MapsExemple {
    public static void main(String[] args) {
        Map<Integer, Persoana>  map = new HashMap<>();

        ///daca folosim acelas keys ele se suprascriu, dar valorile nu conteaza

        map.put(100,new Persoana("Florin","Klonoczki",1255555));
        map.put(101,new Persoana("Erika","Pusok",225555532));
        map.put(102,new Persoana("Erika","Pusok",225555532));

        System.out.println(map.get(102));

        Persoana persoana =  map.get(102);
        System.out.println(persoana.getNume());  //afisare nume

        if(map.containsKey(101)) {  //verificam daca avem acel k si daca da ii afisam prenumele
            System.out.println(map.get(101).getPrenume());

        }else { //daca nu exista returneaza null, nu exista
            System.out.println("Persoana cu Id-ul 101 nu exista in sistem");
        }

    }
}

