package main;

import registry.Autoritate;
import registry.Reglementare;

public class MainRegistry {
    public static void main(String[] args) {
        Autoritate autoritate = Autoritate.getInstance("autoritate", "website");
        Reglementare reglementare1 = autoritate.reglementeazaModel("dacia");
        Reglementare reglementare2 = autoritate.reglementeazaModel("cybertruck");
        System.out.println(reglementare1);
        System.out.println(reglementare2);

        Reglementare reglementare3 = autoritate.reglementeazaModel("dacia");
        System.out.println(reglementare3);
    }
}
