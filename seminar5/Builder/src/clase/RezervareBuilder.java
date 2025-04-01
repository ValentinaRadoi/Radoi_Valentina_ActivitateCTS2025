package clase;

public class RezervareBuilder implements AbstractBuilder{
    private Rezervare instance;

    public RezervareBuilder(String numeClient){
        instance = new Rezervare(numeClient, false, false, false, "fara muzica");

    }

    @Override
    public Rezervare build(){
        return instance;
    }



    public RezervareBuilder setHasScaunErg(Boolean hasScaunErg) {
        instance.setHasScaunErg(hasScaunErg);
        return this;
    }

    public RezervareBuilder setHasMasaDecorata(Boolean hasMasaDecorata) {
        instance.setHasMasaDecorata(hasMasaDecorata);;
        return this;
    }

    public RezervareBuilder setGenMuzica(String genMuzica) {
        instance.setGenMuzica(genMuzica);
        return this;
    }

}
