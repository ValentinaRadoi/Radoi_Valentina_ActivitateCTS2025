package clase;

public abstract class FelDeMnacare {
    private float pret;
    private float calorii;


    public FelDeMnacare(float pret, float calorii) {
        this.pret = pret;
        this.calorii = calorii;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("FelDeMnacare{");
        sb.append("pret=").append(pret);
        sb.append(", calorii=").append(calorii);
        sb.append('}');
        return sb.toString();
    }
}
