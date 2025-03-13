package registry;

public class Reglementare {
    private String model;

    private int nrReglementare;
    private String dataReglementare;


    protected Reglementare(String model,int nrReglementare, String dataReglementare ) {
        this.model = model;
        this.dataReglementare = dataReglementare;
        this.nrReglementare = nrReglementare;
    }

    @Override
    public String toString() {
        return "Reglementare{" +
                "model='" + model + '\'' +
                ", nrReglementare=" + nrReglementare +
                ", dataReglementare='" + dataReglementare + '\'' +
                '}';
    }
}
