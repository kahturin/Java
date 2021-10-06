package br.com.alura.arrays.model;

public class KeeperReferences {

    private Object[] refs;
    private int freePosition;

    public KeeperReferences(){
        this.refs = new Object[10];
    }

    public void add(Object ref){
        this.refs[this.freePosition] = ref;
        this.freePosition++;
    }

    public int getQuantity() {
        return this.freePosition;
    }

    public Object getReference(int i) {
        return this.refs[i];
    }
}
