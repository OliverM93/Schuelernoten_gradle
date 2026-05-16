package com.demo;

import org.json.JSONArray;
import java.util.ArrayList;
import java.util.List;

public class SchuelerManager {

    private List<Schueler> liste = new ArrayList<>();

    public void add(Schueler schueler) {
        liste.add(schueler);
    }

    public JSONArray alleAlsJSON() {
        JSONArray array = new JSONArray();
        for(Schueler schueler : liste) {
            array.put(schueler.toJSON());
        }
        return array;
    }

    public double durchschnitt() {
        double summe = 0;
        for(Schueler schueler : liste) {
            summe += schueler.getNote();
        }
        return summe / liste.size();
    }

    public Schueler bester() {
        Schueler bester = liste.get(0);
        for(Schueler schueler : liste) {
            if (schueler.getNote() < bester.getNote()) {
                bester = schueler;
            }
        }
        return bester;
    }
}
