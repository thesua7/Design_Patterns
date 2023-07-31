package Adapter;

// Adapter pattern works as a bridge between two incompatible interfaces.
// This type of design pattern comes under structural pattern as this pattern combines the capability of two independent interfaces.

public class Task {

    private Pen p;

    public Pen getP() {
        return p;
    }

    public void setP(Pen p) {
        this.p = p;
    }

    public void write(String str){

        p.write(str);
    }
}
