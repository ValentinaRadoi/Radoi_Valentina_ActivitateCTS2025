package main;

import clase.Pacient;
import clase.SpitalPrivat;
import clase.SpitalPublic;
import clase.TemplateInternare;

public class main {
    public static void main(String[] args) {
        Pacient pacient = new Pacient("Andrei",5);
        TemplateInternare spital = new SpitalPublic("spital");
        spital.internare(pacient);
        TemplateInternare spital2 = new SpitalPrivat();
        spital2.internare(pacient);
    }
}
