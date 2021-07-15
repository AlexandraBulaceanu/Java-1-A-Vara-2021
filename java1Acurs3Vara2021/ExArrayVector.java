public class ExArrayVector {
    public static void main(String [] args) {
        int[] numere;
        numere = new int[5];
        
        numere[1] = 10;
        //numere[5] = 6; -  ArrayIndexOutOfBoundsException
        System.out.println(numere[0]+" "+numere[1]);
        
        //populam cu valori de la 2 la 6 array-ul
        for(int i = 0; i < numere.length; i++) {
            numere[i] = i+2;
        }
        
        for(int elem:numere) {
            System.out.println(elem);
        }
        
        //media varstei angajatilor
        Angajat[] angajati = new Angajat[3];
        angajati[0] = new Angajat("Gigel",2345,45);
        angajati[1] = new Angajat();
        angajati[2] = new Angajat("Marcela",3456,34);
        
        //angajati = new Angajat[4];
        
        
        double suma = 0;
        for(int i=0; i < angajati.length; i++) {
            suma += angajati[i].varsta;
        }
        double media = suma/angajati.length;
        System.out.println(media);
        
        //Array Bidimensional
        int ma[][] = new int[3][];
        ma[0] = new int[2];
        ma[1] = new int[3];
        ma[2] = new int[1];
        
        int contor = 1;
        for(int i=0; i<ma.length; i++) {
            for(int j=0;j<ma[i].length;j++) {
                ma[i][j] = contor;
                contor++;
            }
        }
        for(int[] x:ma) {
            for(int y:x) {
                System.out.print(y+" ");
            }
            System.out.println();
        }
    }
}