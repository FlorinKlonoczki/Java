package intalnirea3__loops;

import java.util.Random;

public class ForCondition {
    public static void main(String[] args) {
//        for (int i = 0; i < +100; i++) {
//            System.out.println("cursor " + i);
//        }
//        for (int i = 0; i < +100; i = i + 2) {
//            System.out.println("cursor " + i);
//        }
        Random random = new Random();
        int limitaInferioara = 0;
        int limitaSuperioara = 15;

        for (int i = limitaInferioara; i < limitaSuperioara; i++){
            int x = random.nextInt(limitaSuperioara + 1);
            if (i == x) {
            System.out.println("S-a facut un match " + i + ":" + x);
            }
        }
    }
}
