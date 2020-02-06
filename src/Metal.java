public class Metal extends Material {

    private double volume;
    private double sample;

    public Metal(String title, double weight, double price, double volume, double sample) {
        super(title, weight, price);
        this.volume = volume;
        this.sample = sample;
    }

    public double getVolume() {
        return volume;
    }

    public double getSample() {
        return sample;
    }
}
