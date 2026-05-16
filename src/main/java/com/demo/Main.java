package com.demo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main() {
        SchuelerManager schuelerManager = new SchuelerManager();

        schuelerManager.add(new Schueler("Anna", 101, 1.7));
        schuelerManager.add(new Schueler("Peter", 102, 2.3));
        schuelerManager.add(new Schueler("Simon", 103, 1.0));


        System.out.println("GRADLE PROJEKT");
        System.out.println("alle Schueler:");
        System.out.println(schuelerManager.alleAlsJSON().toString(2));
        System.out.println("Durchschnitt: " + schuelerManager.durchschnitt());
        System.out.println("Bester: " + schuelerManager.bester().getName());

    }
}