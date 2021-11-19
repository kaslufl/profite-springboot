package pers.kaslufl.profite.model.entity;

public class Installment {
    private int count;
    private int value;

    public Installment(int price) {
        this.count = 10;
        this.value = price/count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

}
