package by.bsuir.german;

public class RingBase extends Product {
    double diametr;

    public RingBase(String title, double wight, double price, double diametr) {
        super(title, wight, price);
        this.diametr = diametr;
    }
}
