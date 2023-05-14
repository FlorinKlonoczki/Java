package Intalnirea8;
 public class s1 {

//    int x = 0, y = 0;
//
//    int addx() {
//        x++;
//        return x;
//    }
//
//    int addy() {
//        y++;
//        return y;
//    }
//
//    @Override
//    public void run() {
//        for (int i = 0; i < 10; i ++)
//            System.out.println(addx() + "" + addy());
//
//    }
//
//    public static void main(String[] args) {
//        s1 run1 =new s1();
//        s1 run2 =new s1();
//        Thread t1 = new Thread(run1);
//        Thread t2 = new Thread(run2);
//        t1.start();
//        t2.start();
//    }
//
//     /**
//      *
//      * alt exerciti
//      */
//
//    public static void main(String[] args) {
//        s1 p = new s1();
//        p.start();
//    }
//    void start(){
//        boolean b1 = false;
//        boolean b2 = fix(b1);
//        System.out.println(b1+ "" + b2);
//
//    }
//    boolean fix(boolean b1){
//        b1 =true;
//        return b1;
//      }

     /**
      * alt exercitiu
      */



//    public static void stringReplace(String text) {
//        text = text.replace("j","c");
//    }
//    public static void bifferReplace(StringBuffer text) {
//        text =text.append("c");
//    }
//
//    public static void main(String[] args) {
//        String textString = new String ("java");
//        StringBuffer textBuffer = new StringBuffer("java");
//        stringReplace(textString);
//        bifferReplace(textBuffer);
//        System.out.println(textString + textBuffer);
//    }
     public static void main(String[] args) {
         try{
             throw new Exception("Am execption");
         }
         catch (Exception e){
             System.out.println(e.getMessage());
             System.exit(0);
         }
         finally {
             System.out.println("Reach final");
         }

     }

}
