public class TShirt {
    private String color;

    public TShirt(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "T-Shirt Color: " + color;
    }
}
