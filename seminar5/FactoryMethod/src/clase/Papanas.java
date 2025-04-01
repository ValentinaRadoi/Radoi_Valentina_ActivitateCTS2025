package clase;

public class Papanas extends FelDeMnacare{

    private String crema;

    public Papanas(float pret, float calorii, String crema) {
        super(pret, calorii);
        this.crema = crema;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Papanas{");
        sb.append("crema='").append(crema).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
