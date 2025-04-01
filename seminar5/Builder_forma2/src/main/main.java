package main;

import clase.Rezervare;
import clase.RezervareBuilder;

public class main {
    public static void main(String[] args) {
        RezervareBuilder Builder = new RezervareBuilder();
        Rezervare Rezervare = Builder.setGenMuzica("Dance").setHasAsezareGeam(true).build("Popica");
        Rezervare Rezervare2=Builder.setHasScaunErg(true).build("Marius");
        System.out.println(Rezervare.toString());
        System.out.printf(Rezervare2.toString());

    }
}