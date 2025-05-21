package clase;

public class AdapterObiectMedicament extends MedicamentFarmacie{
    MedicamentSpital medicamentSpital;

    public AdapterObiectMedicament(MedicamentSpital medicamentSpital){
        super(medicamentSpital.getNumeMed(), "25/09/2026",
                medicamentSpital.getPret(), true);
        this.medicamentSpital = medicamentSpital;
    }

    @Override
    public void cumparaMedicament(){
        medicamentSpital.achizitioneazaMedicament();
    }
}
