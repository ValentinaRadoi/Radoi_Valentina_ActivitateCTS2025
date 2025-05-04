package main;

import clase.IRezervare;
import clase.ProxyNumarPersoane;
import clase.ProxyOra;
import clase.Rezervare;

public class main {
    public static void main(String[] args) {
        IRezervare rezervare = new Rezervare();
        rezervare.rezerva("Maria", 5, 15);

        IRezervare proxy = new ProxyNumarPersoane(rezervare);
        proxy.rezerva("Andrei", 3, 15);

        IRezervare proxyOra = new ProxyOra(proxy);
        proxyOra.rezerva("Valentina", 6, 19);
    }
}
