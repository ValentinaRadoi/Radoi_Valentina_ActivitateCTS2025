package clase;

public class HandlerTroleibuz extends Handler {
    @Override
    public void recomanda(int distanta) {
        if(distanta <= 3){
            System.out.println("Se recomanda troleibuzul");
        } else if (urmator!=null) {
            urmator.recomanda(distanta);
        }
    }
}
