package by.bsuir.german.entity;

public class RingBase extends Product {
    private double diametr;

    public RingBase(String title, double weight, double price, Metal metal, double diametr) {
        super(title, weight, price, metal);
        this.diametr = diametr;
    }


}
