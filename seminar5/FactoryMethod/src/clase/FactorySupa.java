package clase;

public class FactorySupa implements AbstractFactory{

    private int cantitate;

    public FactorySupa(int cantitate) {
        this.cantitate = cantitate;
    }

    public void setCantitate(int cantitate) {
        this.cantitate = cantitate;
    }


    @Override
    public FelDeMnacare creareFelDeMancare(TipFelMancare tipFelMancare, float pret, float calorii) {
        switch (tipFelMancare)
        {
            case Supe.supaLegume->
            {return new SupaLegume(pret,calorii,cantitate);}
            case Supe.supaCiuperci->
            {
                return new SupaCiuperci(pret,calorii,cantitate);
            }
            case null, default -> {
                return null;
            }
        }
    }
}
