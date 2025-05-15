package clase;

public class HandlerAutobuz extends Handler{

    @Override
    public void recomanda(int distanta) {
        if(distanta <= 5){
            System.out.println("Se recomanda autobuzul");
        } else if (urmator!=null) {
            urmator.recomanda(distanta);
        }
    }
}
