package clase;

public class MedicamentFarmacie {
    private String nume;
    private String dataExpirare;
    private float pret;
    private boolean esteInStoc;

    public MedicamentFarmacie(String nume, float pret, boolean esteInStoc, String dataExpirare) {
        this.nume = nume;
        this.pret = pret;
        this.esteInStoc = esteInStoc;
        this.dataExpirare = dataExpirare;
    }

    public void cumparaMedicament(){
        System.out.printf("medicamentul" +this.nume + "care expira la " + this.dataExpirare + "are pretul " + this.pret);
    }
}
