public class Angajat {
    int id;
    String nume;
    int nivelFunctie;
    double salariu;
    int varsta;
    static String ceo;
    static int nrAngajati;
    
    Angajat(String nume, double salariu, int varsta) {
        this.nume = nume;
        this.salariu = salariu;
        this.varsta = varsta;
        this.id = nrAngajati;
        nrAngajati++;
    }
    
    Angajat(String nume, double salariu) {
        this.nume = nume;
        this.salariu = salariu;
        this.id = nrAngajati;
        nrAngajati++;
    }
    
    Angajat() {
        this("N/A",1500,18,1);
    }
    
    Angajat(String nume, double salariu, int varsta, int nivelFunctie) {
        this.nume = nume;
        this.salariu = salariu;
        this.varsta = varsta;
        this.nivelFunctie = nivelFunctie;
        this.id = nrAngajati;
        nrAngajati++;
    }
    
    //calculam diferenta de varsta intre doi angajati
    int difVarsta(Angajat a) {
        int dif;
        dif = this.varsta - a.varsta;
        return dif;
        //return this.varsta - a.varsta;
    }
    
    static void afiseazaNrAngajati() {
        System.out.println(nrAngajati);
        //System.out.println(this.nume); -> nu pot sa folosesc ceva non-static intr-o metoda statica
    }
    
    void m(int x) {
        return;
    }
    
    int m(double x) {
        return 5;
    }
    
}