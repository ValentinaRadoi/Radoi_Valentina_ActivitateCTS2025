package clase;

public class AdapterObiectMedicament extends MedicamentFarmacie {
    MedicamentSpital medicamentSpital;


    public AdapterObiectMedicament(MedicamentSpital medicamentSpital){
        super(medicamentSpital.getnume(), medicamentSpital.getPret(), true, '10/10/2025');
    }
}
