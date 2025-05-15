package clase;

public abstract class TemplateMetrou {
    protected abstract void oprireStatia1();
    protected abstract void oprireStatia2();
    protected abstract void oprireStatia3();
    protected abstract void oprireStatia4();
    protected abstract void oprireStatia5();

    public final void circulaTur(){
        oprireStatia1();
        oprireStatia2();
        oprireStatia3();
        oprireStatia4();
        oprireStatia5();
    }

    public final void circulaRetur(){
        oprireStatia5();
        oprireStatia4();
        oprireStatia3();
        oprireStatia2();
        oprireStatia1();
    }

}
