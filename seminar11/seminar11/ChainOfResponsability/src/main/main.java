package main;

import clase.*;

public class main {
    public static void main(String[] args) {
        Handler troleibuz = new HandlerTroleibuz();
        Handler autobuz = new HandlerAutobuz();
        Handler tramvai = new HandlerTramvai();
        Handler metrou = new HandlerMetrou();


        troleibuz.setUrmator(autobuz);
        autobuz.setUrmator(tramvai);
        tramvai.setUrmator(metrou);

        troleibuz.recomanda(2);
        troleibuz.recomanda(5);
        troleibuz.recomanda(7);
        troleibuz.recomanda(20);

    }
}
