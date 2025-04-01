package main;

import clase.Rezervare;
import clase.RezervareBuilder;

public class main {
    public static void main(String[] args) {
        RezervareBuilder builder = new RezervareBuilder("Tudor");
        Rezervare rezervare = builder.setHasScaunErg(false).setGenMuzica("Dance").build();
        Rezervare rezervare1 = builder.setGenMuzica("Rock").build();
        System.out.println(rezervare);
        System.out.println(rezervare1);
    }
}
