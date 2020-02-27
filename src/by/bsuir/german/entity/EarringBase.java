package by.bsuir.german.entity;

import java.io.Serializable;

public class EarringBase extends Product implements Serializable {
    private boolean paired;

    public EarringBase(String title, double weight, double price, Metal metal, boolean paired) {
        super(title, weight, price, metal);
        this.paired = paired;
    }
}
