package clase;

public class AdaptorClaseMedicament extends MedicamentSpital, implements InterfaceMedicamentFarma {


    @Override
    public void cumparaMedicament() {
        super.achizitioneazaMedicament();
    }
}
