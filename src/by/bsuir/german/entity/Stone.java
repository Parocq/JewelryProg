package by.bsuir.german.entity;

import java.io.Serializable;

public class Stone extends Material implements Serializable {

    private String color;
    private boolean stoneType;
    private double transparence;

    public Stone(String title, double weight, double price, String color, boolean stoneType, double transparence) {
        super(title, weight, price);
        this.color = color;
        this.stoneType = stoneType;
        this.transparence = transparence;
    }

    public double getTransparence() {
        return transparence;
    }
}
