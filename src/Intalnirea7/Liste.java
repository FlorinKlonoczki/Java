package Intalnirea7;

import Intalnirea6.Mostenirea.Person;

import java.util.ArrayList;
import java.util.List;

public class Liste {
    public static void main(String[] arg) {

        /**
         * Exemplu construire si initializare
         */

        List<String> fructe =new ArrayList<>();  //punem String dar putem pune si nume de alte clase, Integer


        fructe.add("mar");
        fructe.add("mar");
        fructe.add("mar");
        fructe.add("asdsa");
        System.out.println(fructe);

        while (fructe.contains("mar")) {
            fructe.remove("mar");
        }

        /**
         * Accesare elemte
         */

        String mar = fructe.get(0);
        System.out.println("aici " + mar);
        String par = fructe.get(1);
        System.out.println(par);

        /**
         * Parcurgem elemente.Metoda 1
         */

        for (int i = 0; i< fructe.size(); i++) {  //size() ne da marimea listei
            System.out.println(fructe.get(i));
        }

        /**
         * Parcurgem elemente.Metoda 2 cea  mai buna
         */

        for (String fruct : fructe) {
            System.out.println(fruct);
        }

        List<Person> listaDePersoane = new ArrayList<>();
        listaDePersoane.add(new Person("Florin", "454545","florin.yahoo.com"));
        listaDePersoane.add(new Person("Erika", "454545434","erika.yahoo.com"));
        listaDePersoane.add(new Person("Dani", "454545333","dani.com"));
        listaDePersoane.add(new Person("Dan", "454545222",".dan.yahoo.com"));

        System.out.println(listaDePersoane.size());

    }
}
