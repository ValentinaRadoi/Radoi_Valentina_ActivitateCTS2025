package program;


import clase.AdapterObiectMedicament;
import clase.MedicamentFarmacie;
import clase.MedicamentSpital;

public class main {

    public static void vindeMedicament(MedicamentFarmacie med){
        System.out.println("Bine ati venit la farmacia Dr.Max!");
        med.cumparaMedicament();
    }

    public static void main(String[] args) {
        MedicamentFarmacie medFarmacie = new MedicamentFarmacie("Nurofen",
                "26/09/2027", 124.99f, true);
        vindeMedicament(medFarmacie);

        System.out.println("\n-------- Utilizare Adapter Obiecte --------");
        MedicamentSpital medSpital = new MedicamentSpital("Salofalk", 150);
        vindeMedicament(new AdapterObiectMedicament(medSpital));
    }
}
