package Adapter;

public class AdapterConverter implements Pen{

    Pencil pencil = new Pencil();
    @Override
    public void write(String str) {

        pencil.mark(str);
    }
}
