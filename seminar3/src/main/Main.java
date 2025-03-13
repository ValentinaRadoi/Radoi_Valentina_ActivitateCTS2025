package main;

import ro.cts.clase.AutoritateReglMasiniEAGER;
import ro.cts.clase.AutoritateReglMasiniLAZY;

public class Main {

    public static void main(String[] args){
        AutoritateReglMasiniEAGER autoritate = AutoritateReglMasiniEAGER.getInstance();
        System.out.println(autoritate);

        AutoritateReglMasiniEAGER autoritate2 = AutoritateReglMasiniEAGER.getInstance();
        autoritate2.setWebsite("www.sitenow.ro");
        System.out.println(autoritate2);

        System.out.println(autoritate);

        autoritate2.reglementeazaModel("Dacia Logan");
        System.out.println(autoritate2);


        AutoritateReglMasiniLAZY auto1 = AutoritateReglMasiniLAZY.getInstance("atoritate 1", "www.site1.com" );
        System.out.println(auto1);

        AutoritateReglMasiniLAZY auto2 = AutoritateReglMasiniLAZY.getInstance("autoritate 2", "www.site2.com" );
        System.out.println(auto2);
    }
}
