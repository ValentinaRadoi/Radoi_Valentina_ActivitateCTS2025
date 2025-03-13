package ro.cts.clase;

public class AutoritateReglMasiniLAZY {
    private String nume;
    private String website;
    private int nrReglementari;
    private static AutoritateReglMasiniLAZY instance = null;


    private AutoritateReglMasiniLAZY(String nume, String website, int nrReglementari) {
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

    //cu synchronized facem singleton trade safe
    public static synchronized AutoritateReglMasiniLAZY getInstance(String nume, String website) {
        if(instance==null){
            instance = new AutoritateReglMasiniLAZY(nume, website, 0);
        }
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
