package by.bsuir.german;

public class RingBase extends Product {
    double diametr;

    public RingBase(String title, double wight, double price, Metal metal, double diametr) {
        super(title, wight, price, metal);
        this.diametr = diametr;
    }
}
