package ro.cts.clase;

public class AutoritateReglMasiniEAGER {
    private String nume;
    private String website;
    private int nrReglementari;
    private static AutoritateReglMasiniEAGER instance = new AutoritateReglMasiniEAGER("autoritateAuto", "www.site.ro", 9);


    private AutoritateReglMasiniEAGER(String nume, String website, int nrReglementari) {
        this.nume = nume;
        this.website = website;
        this.nrReglementari = nrReglementari;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public void reglementeazaModel(String nume){
        nrReglementari = nrReglementari+1;
    }

    public static AutoritateReglMasiniEAGER getInstance() {
        return instance;
    }

    @Override
    public String toString() {
        return "AutoritateReglMasiniEAGER{" +
                "nume='" + nume + '\'' +
                ", website='" + website + '\'' +
                ", nrReglementari=" + nrReglementari +
                '}';
    }
}
