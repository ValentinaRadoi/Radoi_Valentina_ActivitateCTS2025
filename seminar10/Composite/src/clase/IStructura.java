package clase;

public interface IStructura {
    void adaugaStructura(IStructura structuri) throws Exception;
    void stergeStructura(IStructura structuri) throws Exception;
    void afiseazaDescriere();
    IStructura getStructura(int index) throws Exception;
}
