package clase;

public class HandlerTramvai extends Handler{

    @Override
    public void recomanda(int distanta) {
        if(distanta <= 10){
            System.out.println("Se recomanda tramvaiul");
        } else if (urmator!=null) {
            urmator.recomanda(distanta);
        }
    }
}
