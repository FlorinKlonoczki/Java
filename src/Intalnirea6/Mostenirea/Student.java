package Intalnirea6.Mostenirea;

public class Student extends  Person {

    private int studentNumber;

    public Student(String name,String phoneNumber, String emailAddress, int studentNumber) {
        super(name, phoneNumber, emailAddress );
        this.studentNumber = studentNumber;
    }

    protected void afisareDateStudent() {
        afisareDatePersoana(); // optional daca vrei sa afiseze toate datele persoanei
        System.out.println("Date student: "+
                "\nNumar student: "+ this.studentNumber+
                "\n--------" );
    }


}
