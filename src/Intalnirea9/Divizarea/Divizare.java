package Intalnirea9.Divizarea;

public class Divizare {
     public static void main(String[] args) {
            // try and catch merg tot timpul impreuna
         try {
             System.out.println(impartireSafe(10,0));

         }catch (ExceptionExample exception) { //exeption este o variabila
             System.out.println("S-a incercat impartirea la 0 ");
             exception.printStackTrace(); //arata mesajul de la ExeptionExample, dar la proiectele mari nu e bine sa folosim
         }

     }

     public static int impartireSafe(int numar1, int numar2) throws ExceptionExample {
         if (numar2 == 0){
             throw new ExceptionExample("Ati facut impartirea la 0 ");
             //throw inseamna ca arunca noi o exceptie daca numar2 este 0
         }
         return  numar1 / numar2;
     }
}
