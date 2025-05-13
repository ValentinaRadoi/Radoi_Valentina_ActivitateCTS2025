package clase;

import java.util.ArrayList;
import java.util.List;

public class Departament implements IStructura {
    private String nume;
    private int numarAngajati;
    private List<IStructura> lista;

    public Departament(String nume, int numarAngajati) {
        this.nume = nume;
        this.numarAngajati = numarAngajati;
        lista=new ArrayList<IStructura>();
    }

    @Override
    public void adaugaStructura(IStructura structuri) throws Exception {
        lista.add(structuri);
    }

    @Override
    public void stergeStructura(IStructura structuri) throws Exception {
        lista.remove(structuri);
    }

    @Override
    public void afiseazaDescriere() {
        System.out.println("Departamentul "+this.nume+" are "+this.numarAngajati+" angajati"
                + " si urmatoarele subsectii:");
        for(IStructura structura : lista) {
            structura.afiseazaDescriere();
        }

    }

    @Override
    public IStructura getStructura(int index) throws Exception {
        return lista.get(index);
    }
}
