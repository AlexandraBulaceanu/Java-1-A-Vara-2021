public class ExValoareVsReferinta {
    public static void main(String [] args) {
        int x = 10;
        
        TransferPrinValoareVsReferinta t1 = new TransferPrinValoareVsReferinta();
        
        System.out.println("x inainte de apel "+x);
        t1.transferPrinValoare(x);
        System.out.println("x dupa apel "+x);
        
        Angajat a = new Angajat("Dorel",3000,40);
        
        System.out.println("a.varsta inainte de apel "+a.varsta);
        t1.transferPrinReferinta(a);
        System.out.println("a.varsta dupa apel "+a.varsta);
        
        //J10
        //var
        var sir = "Seara";
        //sir = 5;
        var a1 = new Angajat();
        //var x;
    }
}