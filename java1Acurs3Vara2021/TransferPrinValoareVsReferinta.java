public class TransferPrinValoareVsReferinta {
    
    void transferPrinValoare(int x) {
        x = x*2;
        System.out.println("x in metoda "+x);
    }
    
    void transferPrinReferinta(Angajat a1) {
        //Pisica p1;
        //Angajat a1;
        //a1 = a
        a1.varsta = 34;
        System.out.println("a1.varsta din metoda "+a1.varsta);
    }
}