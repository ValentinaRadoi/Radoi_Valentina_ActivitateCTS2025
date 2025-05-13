package main;

import clase.Departament;
import clase.IStructura;
import clase.Sectie;

public class main {
    public static void main(String[] args) {
        IStructura departamanet1 = new Departament("pediatrie", 34);
        IStructura departamanet2 = new Departament("icu",10);
        IStructura departamanet3 = new Departament("general",50);

        Sectie sectie1 = new Sectie("sectie1");
        Sectie sectie2 = new Sectie("sectie2");
        Sectie sectie3 = new Sectie("sectie3");


        try{
            departamanet3.adaugaStructura(departamanet1);
            departamanet3.adaugaStructura(departamanet2);

            departamanet2.adaugaStructura(sectie2);
            departamanet1.adaugaStructura(sectie1);
            departamanet3.adaugaStructura(sectie3);

            departamanet3.afiseazaDescriere();

        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }





    }
}