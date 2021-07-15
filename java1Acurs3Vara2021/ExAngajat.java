public class ExAngajat {
    public static void main(String [] args) {
        Angajat a1 = new Angajat("John",2000,25);
        Angajat a2 = new Angajat("Bob",4000,23);
        a1.ceo = "Maria";
        a2.ceo = "Bogdan";
        Angajat.ceo = "Marian";
        
        
        //var rez = a1.difVarsta(a2);
        int rez = a1.difVarsta(a2);
        System.out.println(rez);
        
        System.out.println(a1.ceo + " " + a1.id);
        System.out.println(a2.ceo + " " + a2.id);
        System.out.println(Angajat.ceo);
        
        System.out.println(Angajat.nrAngajati);
        
        a1.afiseazaNrAngajati();
        a2.afiseazaNrAngajati();
        Angajat.afiseazaNrAngajati();
        
        Angajat a3 = new Angajat();
        Angajat a4 = new Angajat("Mirela",5600);
        System.out.println(a3.nume + " " + a3.varsta + " " + a3.salariu + " " + a3.nivelFunctie);
        System.out.println(a4.nume + " " + a4.varsta + " " + a4.salariu + " " + a4.nivelFunctie);
    }
}
//class Ceva {}