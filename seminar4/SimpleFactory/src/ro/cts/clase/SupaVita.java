package ro.cts.clase;

public class SupaVita extends Supe{
    public SupaVita(float pret, float cantitate, float calorii) {
        super(pret, cantitate, calorii);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println(super.toString());
    }
}
