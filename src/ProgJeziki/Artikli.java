package ProgJeziki;

import java.util.ArrayList;
import java.util.List;

public class Artikli {


    private ArrayList<Artikel> seznam;

    public Artikli() {

        this.seznam = new ArrayList<>();

    }

    public void dodaj(Artikel l) {


        seznam.add(l);


    }

    public ArrayList<Artikel> getTabela() {
        return seznam;
    }

    public void setTabela(ArrayList<Artikel> tabela) {
        this.seznam = tabela;
    }

    @Override
    public String toString() {
        return "Artikli: " +
                seznam ;

    }


}