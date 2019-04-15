package ProgJeziki;

import java.util.ArrayList;

public class Racuni {
    private ArrayList<Racun> seznam;

    public Racuni(){
        this.seznam= new ArrayList<>();
    }

    public void addRacun(){};

    public ArrayList<Racun> getTabela() {
        return seznam;
    }

    public void setTabela(ArrayList<Racun> tabela) {
        this.seznam = tabela;
    }

    @Override
    public String toString() {
        return "Racuni" + seznam +
                ' ';
    }
}
