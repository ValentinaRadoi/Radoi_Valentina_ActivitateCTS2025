package clase;

public class Sectie implements IStructura {
    private String nume;

    public Sectie(String nume) {
        this.nume = nume;
    }


    @Override
    public void adaugaStructura(IStructura structuri) throws Exception {
        throw new Exception("Aceasta functie nu a fost implementata");
    }

    @Override
    public void stergeStructura(IStructura structuri) throws Exception {
        throw new Exception("Aceasta functie de stergere nu a fost implementata");
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Secita "+this.nume);
    }

    @Override
    public IStructura getStructura(int index) throws Exception {
        throw new Exception("Aceasta functie de cautarea nu a fost implementata");
    }
}
