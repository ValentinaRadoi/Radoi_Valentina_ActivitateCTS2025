package main;

import Fabricuta.FabricaSupe;
import Fabricuta.TipSupa;
import ro.cts.clase.Supe;

public class Program {
    public static void main(String[] args) {
        FabricaSupe fabricuta = new FabricaSupe(100,20);
        Supe supica=fabricuta.getSupa(TipSupa.LEGUME,300);
        supica.afiseazaDescriere();
        Supe supica2 = fabricuta.getSupa(TipSupa.VITA,300);
        supica2.afiseazaDescriere();
        Supe supica3 = fabricuta.getSupa(TipSupa.COCOS,210);
        supica3.afiseazaDescriere();

    }
}
