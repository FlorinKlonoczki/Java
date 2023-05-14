package Intalnirea5OOP;

 public class Persoana { //cele 4 leyere principale: -1 definirea clasei
    private String prenume;  //-2 proprietati
    private String nume;
    private long cnp;

    public Persoana(String prenume, String nume, long cnp) {  //adaugam parametri in paranteze
        // -3 metoda contructor  care creaza obiectul
//        prenume = "Dragos";
//        nume = "Roban";
//        cnp = 1235388625563L;
        this.prenume = prenume; //am luat prenume din clasa cu prenume din parametri
        this.nume = nume;
        this.cnp = cnp;

    }

    public void vorbeste() {  //construim o metoda
        System.out.println("Sunt o persoana si ma numesc " +this.prenume + " " + this.nume);

    }

    public String numeComplet() {
        return prenume +" assdasdas "+ nume;
    }

     public String getPrenume() {   //trebuie setat tipul de return adica ca e String
         return prenume;
     }

     public void setPrenume(String prenume) {
         this.prenume = prenume;
     }

     public String getNume() {
         return nume;
     }

     public void setNume(String nume) {
         this.nume = nume;
     }

     public long getCnp() {
         return cnp;
     }

     public void setCnp(long cnp) {
         this.cnp = cnp;
     }

     @Override
     public String toString() {
         return "Persoana{" +
                 "prenume='" + prenume + '\'' +
                 ", nume='" + nume + '\'' +
                 ", cnp=" + cnp +
                 '}';
     }

     public static void main(String[] args) {
         Persoana p = new Persoana("Florin","Klonoczki",1255555);

         System.out.println(p);
     }
 }
