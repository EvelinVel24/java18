import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // Define the size of the bag
        Bag<Object> shoppingBag = new Bag<>(3);

        // Adding items to the bag
        Shoe shoe1 = new Shoe("Nike");
        Shoe shoe2 = new Shoe("Adidas");
        TShirt tshirt1 = new TShirt("Red");

        shoppingBag.addItem(shoe1);
        shoppingBag.addItem(shoe2);
        shoppingBag.addItem(tshirt1);

        // Display items in the bag
        shoppingBag.showItems();
    }
}
