package Intalnirea7;

public class StringExemple {
    public static void main(String[] args) {
        //Prea obositor, nu ecomisim timp, posibil pierderi de date
        String fruct1 = "mar";
        String fruct2 = "par";
        String fruct3 = "ciresica";
        String fruct4 = "banana";

        //Exemplu de initializare directa cu valori
        String[] exempluArrayFructe = {"mar", "par", "ciresica", "banana"};
        String[] exempluArrayFructe2 = {fruct1, "par", fruct3, fruct4};

        int[] arrayDeInt = {1, 2, 3, 4, 5};
        double[] arrayDeDouble = {2.33, 3.55, 4534.32432432};


        //Exemplu de constructie
        String[] exempluConstructieArray;
        exempluConstructieArray = new String[4];
        exempluConstructieArray[0] = fruct1;
        exempluConstructieArray[1] = fruct2;
        exempluConstructieArray[2] = fruct3;
        exempluConstructieArray[3] = fruct4;

        System.out.println("Lungimea array-ului este: " + exempluConstructieArray.length);

        /**
         * Parcurgem arrau-ul. Metoda1
         */
        for (int i = 0; i < exempluConstructieArray.length; i++) {
            System.out.println(exempluConstructieArray[i]);
        }

        /**
         * Parcurgere array, Metoda2 se aplica doar pe array si liste

         */
        int i = 0;
        System.out.println("Afisare prin for special: ");

        for (String fruct : exempluArrayFructe2) {
            // fruct este o variabila ajutatoare
            System.out.println("Sunt la pozitia " + i + "");
            System.out.println(fruct + " in cos"); //concatenam
            i = i +1;
        }
    }


}
