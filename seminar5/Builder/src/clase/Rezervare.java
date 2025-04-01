package clase;

public class Rezervare {
    private String numeClient;
    private Boolean hasRezGeam;
    private Boolean hasScaunErg;
    private Boolean hasMasaDecorata;
    private String genMuzica;


    protected Rezervare(String numeClient, Boolean hasRezGeam, Boolean hasScaunErg, Boolean hasMasaDecorata, String genMuzica) {
        this.numeClient = numeClient;
        this.hasRezGeam = hasRezGeam;
        this.hasScaunErg = hasScaunErg;
        this.hasMasaDecorata = hasMasaDecorata;
        this.genMuzica = genMuzica;
    }

    public void setNumeClient(String numeClient) {
        this.numeClient = numeClient;
    }

    public void setHasRezGeam(Boolean hasRezGeam) {
        this.hasRezGeam = hasRezGeam;
    }

    public void setHasScaunErg(Boolean hasScaunErg) {
        this.hasScaunErg = hasScaunErg;
    }

    public void setHasMasaDecorata(Boolean hasMasaDecorata) {
        this.hasMasaDecorata = hasMasaDecorata;
    }

    public void setGenMuzica(String genMuzica) {
        this.genMuzica = genMuzica;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rezervare{");
        sb.append("numeClient='").append(numeClient).append('\'');
        sb.append(", hasRezGeam=").append(hasRezGeam);
        sb.append(", hasScaunErg=").append(hasScaunErg);
        sb.append(", hasMasaDecorata=").append(hasMasaDecorata);
        sb.append(", genMuzica='").append(genMuzica).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
