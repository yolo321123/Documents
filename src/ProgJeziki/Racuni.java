package ProgJeziki;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class Racuni implements JsonSupport{
    private ArrayList<Racun> seznam;

    public Racuni(){
        this.seznam= new ArrayList<>();
    }

    public void addRacun(Racun l){
        seznam.add(l);
    };

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
    public String toJson() {
        Gson gson = new Gson();
        String json = gson.toJson(this);
        System.out.println(json);

        try (FileWriter writer = new FileWriter("C:\\Users\\J-MAN\\Desktop\\test.json")) {

            gson.toJson(this, writer);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }

    @Override
    public void fromJson(String json) {

        Gson gson = new Gson();

        try (Reader reader = new FileReader("C:\\Users\\J-MAN\\Desktop\\test.json")) {

            Racuni obj = gson.fromJson(reader, Racuni.class);
            System.out.println(obj);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
