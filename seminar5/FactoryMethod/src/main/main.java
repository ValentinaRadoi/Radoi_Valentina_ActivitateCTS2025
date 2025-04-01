package main;

import clase.*;

public class main {
    public static void main(String[] args) {
        FactorySupa fabricaSupe = new FactorySupa(100);
        FactoryDesert fabricaDesert = new FactoryDesert("Zmeura");
        FelDeMnacare supaDeCiuperci = fabricaSupe.creareFelDeMancare(Supe.supaCiuperci,10,20);
        fabricaSupe.setCantitate(300);
        FelDeMnacare supaDeLegume = fabricaSupe.creareFelDeMancare(Supe.supaLegume,200,12);
        FelDeMnacare tiramisu = fabricaDesert.creareFelDeMancare(Deserturi.tiramisu,300,12);
        FelDeMnacare papanasi = fabricaDesert.creareFelDeMancare(Deserturi.papanas,400,12);
        System.out.println(supaDeCiuperci);
        System.out.println(supaDeLegume);
        System.out.println(tiramisu);
        System.out.println(papanasi);
    }
}

