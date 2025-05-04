package clase;

public abstract class PrinterFelicitare {
    private Nota notaDePlata;

    public PrinterFelicitare(Nota notaDePlata) {
        this.notaDePlata = notaDePlata;
    }


    public void printare() {
        notaDePlata.printare();
        printareFelicitare();
    }

    protected abstract void printareFelicitare();

}
