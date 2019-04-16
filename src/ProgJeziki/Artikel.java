package ProgJeziki;

import java.lang.*;

public class Artikel implements Searchable {

    private int Cena;
    private int Kolicina;
    private String Ime;
    private String id;
    int[] EAN = new int[13];
    private int ddv;
    private String drzava;
    private int teza;

    public int[] getEAN() {
        return EAN;
    }

    public void setEAN(int[] EAN) {
        this.EAN = EAN;
    }

    public String getDrzava() {
        return drzava;
    }

    public void setDrzava(String drzava) {

        this.drzava = drzava;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getDdv() {
        return ddv;
    }

    public void setDdv(int ddv) {
        this.ddv = ddv;
    }

    public String getIme() {
        return Ime;
    }

    public void setIme(String ime) {
        Ime = ime;
    }

    public int getCena() {
        return Cena;
    }

    public void setCena(int Cena) {

        Cena = Cena;
    }

    public int getKolicina()
    {
        return Kolicina;
    }

    public void setKolicina(int Kolicina)
    {
        Kolicina = Kolicina;
    }


    public Artikel(int Cena, String ime, int Kolicina,String id, int[] EAN)
    {

        this.id=id;
        this.Cena = Cena;
        this.Ime = ime;
        this.Kolicina = Kolicina;
        this.EAN =EAN;

    }

    @Override
    public String toString()
    {
        return "\n" + "Artikel{" +
                "Cena=" + Cena +
                ", Kolicina=" + Kolicina +
                ", Ime='" + Ime + '\'' + "EAN= "+convert(EAN) + " " +
                '}';
    }

    public  String convert(int EAN[]){
        posodobljen(EAN);
        String strArray = new String();
        for(int i=0; i<EAN.length;i++) {
            strArray +=String.valueOf(EAN[i]);

        }
        return strArray;

    }


    public  int[] posodobljen(int [] x ){
        if(teza!=0) {

            int[] tt = new int[4];

            tt[0]= teza / 1000;
            teza = teza % 1000;
            tt[1] = teza /100;
            teza = teza % 100;
            tt[2] = teza /10;
            teza = teza %10;
            tt[3] = teza;

            x[8] = tt[0];
            x[9] = tt[1];
            x[10] = tt[2];
            x[11] = tt[3];
        }else {
            return x;
        }
        return x;
    }


    public int pregled_teze(int teza,long[] x){

        // if(teza==0) {
        long tmp = 0;
        tmp = x[8] * 1000;
        teza = (int) tmp;
        tmp = x[9] * 100;
        teza += tmp;
        tmp = x[10] * 10;
        teza += tmp;
        tmp = x[11] * 1;
        teza += tmp;
        // }
        //  else if(teza!=0){

        //}

        return teza;
    }


    @Override
    public boolean search(String n)
    {
        if (getIme().contains(n))
            return true;

        return false;
    }

    public boolean compare()
    {
        if(this.getIme()== this.getIme())
        {
            this.setKolicina(1);
            return true;
        }

        return false;
    }


    public  boolean checkDigit(int x[])
    {

        int sodo = 0;
        int liho = 0;
        int skupajSUM = 0;
        int checksum_digit = 0;
        int lastItem = x[x.length - 1];

        for (int i = 0; i <= x.length - 1; i++)
        {
            if (i % 2 == 0)
            {
                liho += x[i];
            } else {
                sodo += x[i];
            }
        }
        sodo=sodo*3;
        skupajSUM = sodo + liho;
        checksum_digit = 10 - (skupajSUM % 10);

        System.out.println(checksum_digit);
        if (checksum_digit == 10)
        {
            checksum_digit = 0;
        }
        if (checksum_digit == lastItem)
            return false;
        else
            return true;
    }
}