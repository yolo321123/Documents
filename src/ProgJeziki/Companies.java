package ProgJeziki;

import com.google.gson.Gson;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;

public class Companies implements JsonSupport{
    private ArrayList<Podjetje> seznam;

    public Companies(){
        this.seznam= new ArrayList<>();
    }

    public void addPodjetje(Podjetje l){
        seznam.add(l);
    };

    public ArrayList<Podjetje> getTabela() {
        return seznam;
    }

    public void setTabela(ArrayList<Podjetje> tabela) {
        this.seznam = tabela;
    }

    @Override
    public String toString() {
        return "Podjetja" + seznam +
                ' ';
    }
    @Override
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

            Companies obj = gson.fromJson(reader, Companies.class);
            System.out.println(obj);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
