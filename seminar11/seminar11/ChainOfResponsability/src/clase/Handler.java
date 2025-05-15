package clase;

public abstract class Handler {
    protected Handler urmator;

    public void setUrmator(Handler urmator) {
        this.urmator = urmator;
    }

    public abstract void recomanda(int distanta);
}
