package clase;

public class SupaLegume extends FelDeMnacare {

    private int cantitate;

    public SupaLegume(float pret, float calorii, int cantitate) {
        super(pret, calorii);
        this.cantitate = cantitate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SupaLegume{");
        sb.append("cantitate=").append(cantitate);
        sb.append('}');
        return sb.toString();
    }
}
