package main;

import clase.Metrou;
import clase.MetrouSpecilal;
import clase.TemplateMetrou;

public class main {
    public static void main(String[] args) {

        System.out.println("\n--------------- TEMPLATE ---------------\n");

        TemplateMetrou metrou = new Metrou(6);
        TemplateMetrou metrouSpecial = new MetrouSpecilal();

        System.out.println("\n--------------------");
        metrou.circulaTur();
        metrou.circulaRetur();


        System.out.println("\n--------------------");
        metrouSpecial.circulaTur();
        metrouSpecial.circulaRetur();
    }
}
