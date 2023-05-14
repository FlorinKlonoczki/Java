package intalnirea3__loops;

public class whileCondition {
    public static void main(String[] args) {
        int x = 0;

//        while (x < 100) {
//            System.out.println(x);
//            x++;      // se incrementeaza x cu 1 ar fi egal cu x = x+1
//        }
//        while (x < 100) {
//            System.out.println(x);
//           if (x == 50){
//               break;
//           }
//           x++;
//        }
        while (x < 100) {
            x++;
            if (x == 50){
                continue;
            }
            System.out.println(x);

        }
    }

}
