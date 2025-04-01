package clase;

public class FactoryDesert implements AbstractFactory {
    private String crema;

    public FactoryDesert(String crema) {
        this.crema = crema;
    }

    public void setCantitate(String crema) {
        this.crema = crema;
    }



    @Override
    public FelDeMnacare creareFelDeMancare(TipFelMancare tipFelMancare, float pret, float calorii) {

        switch (tipFelMancare) {
            case Deserturi.tiramisu ->
            {
                return new Tiramisu(pret,calorii,crema);
            }
            case Deserturi.papanas ->
            {return new Papanas(pret,calorii,crema);}
            case null, default ->
            {
                return null;
            }
        }
    }
}
