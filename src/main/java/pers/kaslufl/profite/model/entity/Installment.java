package pers.kaslufl.profite.model.entity;

public class Installment {
    private int count;
    private float value;

    public Installment(int count, float price) {
        this.count = 10;
        this.value = price/count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public float getValue() {
        return value;
    }

    public void setValue(float value) {
        this.value = value;
    }

}
