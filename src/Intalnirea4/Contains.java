package Intalnirea4;

public class Contains {
    public static void main(String[] args) {
        String wikipedia = "In earlier computing models like client-server, the processing load for the application was" +
                " shared between code on the server and code installed on each client locally" ;

        boolean contain = wikipedia.contains("computing models like");
        boolean startWith = wikipedia.startsWith("In earlier");
        boolean endWith = wikipedia.endsWith("each client");
        System.out.println(contain);
        System.out.println(startWith);
        System.out.println(endWith);
    }
}
