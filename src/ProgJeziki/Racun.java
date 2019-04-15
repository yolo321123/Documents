package ProgJeziki;

import java.util.Date;


public class Racun implements Searchable {

    String id;
    protected Date datum;
    Artikli izdelki;
    Podjetje izdajatelj;
    int davcna;




    public Racun(String ajd, Artikli product, Date datum, Podjetje giver, int davcnaidk) {
        this.id = ajd;
        this.datum = datum;
        this.izdelki=product;
        this.davcna=davcnaidk;
        this.izdajatelj = giver;
    }

    public int getDavcna() {
        return davcna;
    }

    public void setDavcna(int davcna) {
        this.davcna = davcna;
    }

    public Artikli getArt() {
        return izdelki;
    }

    public void setArt(Artikli art) {
        this.izdelki = art;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    public void setIzdajatelj(Podjetje izdajatelj)
    {
        this.izdajatelj = izdajatelj;
    }

    public Podjetje getIzdajatelj() {
        return izdajatelj;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    @Override
    public String toString() {
        return "Racun: " +
                "id='" + id + "\n"+ "davcna st:" + davcna + "\n" +
                "izdajatelj: " + izdajatelj +
                "datum: " + datum +"\n"+
                izdelki ;

    }




    @Override
    public boolean search(String n) {
        if(n==getIzdajatelj().getIme())
            return true;

        return false;
    }
}
