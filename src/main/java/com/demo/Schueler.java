package com.demo;

import org.json.JSONObject;

public class Schueler {

    private String name;
    private int matrikel;
    private double note;

    public Schueler(String name, int matrikel, double note) {
        this.name = name;
        this.matrikel = matrikel;
        this.note = note;
    }

    public JSONObject toJSON() {
        JSONObject obj = new JSONObject();
        obj.put("name", name);
        obj.put("matrikel", matrikel);
        obj.put("note", note);
        return obj;
    }

    public String getName() {
        return name;
    }

    public double getNote() {
        return note;
    }

    public int getMatrikel() {
        return matrikel;
    }

}
