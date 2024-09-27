public class Shoe {
    private String brand;

    public Shoe(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Shoe Brand: " + brand;
    }
}
