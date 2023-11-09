package ru.mirea.lab_20.task1;

public class ThreeGeneric<T extends String, V extends Animal, K extends Number> {
    private T typeObjT;
    private V typeObjV;
    private K typeObjK;

    public ThreeGeneric(T typeObjT, V typeObjV, K typeObjK) {
        this.typeObjT = typeObjT;
        this.typeObjV = typeObjV;
        this.typeObjK = typeObjK;
    }


    public void showTypes(){
        System.out.println("Argument #1: " + this.typeObjT.getClass().getName());
        System.out.println("Argument #2: " + this.typeObjV.getClass().getName());
        System.out.println("Argument #3: " + this.typeObjK.getClass().getName());
    }
    public T getTypeObjT() {
        return typeObjT;
    }

    public void setTypeObjT(T typeObjT) {
        this.typeObjT = typeObjT;
    }

    public V getTypeObjV() {
        return typeObjV;
    }

    public void setTypeObjV(V typeObjV) {
        this.typeObjV = typeObjV;
    }

    public K getTypeObjK() {
        return typeObjK;
    }

    public void setTypeObjK(K typeObjK) {
        this.typeObjK = typeObjK;
    }
}
