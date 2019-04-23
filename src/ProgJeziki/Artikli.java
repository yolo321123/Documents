package ProgJeziki;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

public class Artikli implements JsonSupport {


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
                seznam+
        "\n-------------------------------------------------------------------\n";

    }
    @Override
    public String toJson() {
        Gson gson = new Gson();
        String json = gson.toJson(this);
        System.out.println(json);

        Helper.WritetoFile("C:\\Users\\J-MAN\\Desktop\\test.json",json);
        return json;
    }

    @Override
    public void fromJson(String json) {


        Gson gson = new Gson();

            Artikli obj = gson.fromJson(Helper.ReadFromFile(json), Artikli.class);
            System.out.println(obj);


    }
}