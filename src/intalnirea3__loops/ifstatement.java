package intalnirea3__loops;

import java.util.Random;

public class ifstatement {
    public static void main(String[] args) {
        boolean condition = true;

        if(condition) {
            System.out.println("Acesta conditie este indeplinita");
        }else {
            System.out.println("Acesta conditie nu este indeplinita");
        }

        Random random = new Random();
        int randomInt = random.nextInt(100);

        if ( randomInt < 50) {
            if (randomInt < 25) {
                System.out.println("Numarul " + randomInt + " este mai mic decat 25");
            } else {
                System.out.println("Numarul " + randomInt + " este intre 25 si 50");

            }
        }else{
            if(randomInt< 75){
                System.out.println("Numarul " + randomInt + " este intre 50 si 75");

            }else{
                System.out.println("Numarul " + randomInt + " este intre 75 si 99");
            }
        }
    }
}
