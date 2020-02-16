package by.bsuir.german;

public class RingBase extends Product {
    double diametr;

    public RingBase(String title, double weight, double price, Metal metal, double diametr) {
        super(title, weight, price, metal);
        this.diametr = diametr;
    }


}
