package main;

import clase.Nota;
import clase.NotaDePlata;
import clase.NotaDePlataCraciun;
import clase.NotaDePlataRevelion;

public class main {
    public static void main(String[] args) {
        Nota notaDePlata = new NotaDePlata(500.5f);
        notaDePlata.printare();
        NotaDePlataRevelion notaDecorata = new NotaDePlataRevelion(notaDePlata);
        notaDecorata.printare();


        NotaDePlataCraciun notaDecorataCraciun = new NotaDePlataCraciun(notaDePlata);
        NotaDePlataCraciun nota2  = new NotaDePlataCraciun(notaDePlata);
        nota2.printare();
        notaDecorataCraciun.printare();
    }
}