package de.neuefische;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String[] strings = new String[2];

        //Generic
        List<String> stringList = new ArrayList<>(); // String[1];

        //Zur Liste hinzufügen
        stringList.add("Test");
        stringList.add("Hallo");
        stringList.add("Liste");

        //Auf bestimmte Position hinzufügen
        stringList.add(0, "Erste");

        //Aus Liste entfernen
        stringList.remove("Test");
        stringList.remove(0);

        //Index des Eintrages finden
        stringList.indexOf("Test");

        //Element aus Liste lesen
        stringList.get(0);

        //Wie viele Elemente hat die Liste? -> Wie lang ist die Liste?
        stringList.size();

        //Ist iterierbar, wir können Schleifen anwenden
        for (String s:stringList) {
            System.out.println(s);
        }


        //Wrapper Klassen
        List<Integer> integers = new ArrayList<>(); // int = Integer, double = Double, boolean = Boolean, long = Long, char = Character
        integers.add(5);
        integers.add(10);
        integers.add(15);

        System.out.println(integers.get(0) + integers.get(2));

    }
}