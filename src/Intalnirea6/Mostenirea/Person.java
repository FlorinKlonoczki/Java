package Intalnirea6.Mostenirea;

public class Person {
    private String name;
    private String phoneNumber ;
    private String emailAddress;

    public Person(String name, String phoneNumber, String emailAddress) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
    }
    protected void afisareDatePersoana() {
        System.out.println("Datele persoanei: "+
                "\nNume: "+ this.name +
                "\nTelefon: "+this.phoneNumber +
                "\nEmail: " +this.emailAddress);
    }

}

