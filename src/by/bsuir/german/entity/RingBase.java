package by.bsuir.german.entity;

import java.io.Serializable;

public class RingBase extends Product implements Serializable {
    private double diametr;

    public RingBase(String title, double weight, double price, Metal metal, double diametr) {
        super(title, weight, price, metal);
        this.diametr = diametr;
    }


}
