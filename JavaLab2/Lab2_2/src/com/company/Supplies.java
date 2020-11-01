package com.company;

public class Supplies {
    private final int PRICE = 40;
    private int minutes;

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public Supplies() {
    }

    public void costInchiriere(){
        System.out.println("Price for the equipment is:" + this.minutes*PRICE + "$");
    }
}
