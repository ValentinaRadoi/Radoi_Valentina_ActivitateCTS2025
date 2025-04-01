package clase;

public class SupaCiuperci extends FelDeMnacare {

    private int cantitate;

    public SupaCiuperci(float pret, float calorii, int cantitate) {
        super(pret, calorii);
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SupaCiuperci{");
        sb.append("cantitate=").append(cantitate);
        sb.append('}');
        return sb.toString();
    }
}
