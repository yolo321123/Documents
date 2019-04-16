package ProgJeziki;



import java.util.Date;

public class  Main {

    public static void main(String[] args) {


        int[] EANKODA1 = {1,2,3,4,8,4,1,2,0,1,3,3,0};
        int[] EANKODA2 = {1,7,2,4,8,4,1,2,0,1,0,0,0};

        Artikel a1 = new Artikel(1999,"Tipkovnica",6,"25",EANKODA1);
        Artikel a2 = new Artikel(3999,"Monitor",2,"8",EANKODA2);

        Artikli b1 = new Artikli();

        b1.dodaj(a1);
        b1.dodaj(a2);

        Podjetje c1 = new Podjetje("Kopa",12709743,5231914000L,true);

        Racun d1 = new Racun("112",b1,new Date(),c1,43781324);

        Racuni e1= new Racuni();

        boolean bool =a1.checkDigit(a1.getEAN());
        if (bool=true) {
            System.out.printf("true\n");
        }
        else
        {
            System.out.printf("false\n");
        }
        System.out.printf(d1.toString());

    }

}