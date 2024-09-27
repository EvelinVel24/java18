public class Bag<T> {
    private int size;
    private ArrayList<T> items;

    public Bag(int size) {
        this.size = size;
        this.items = new ArrayList<>();
    }

    public void addItem(T item) {
        if (items.size() < size) {
            items.add(item);
            System.out.println(item.getClass().getSimpleName() + " added to the bag.");
        } else {
            System.out.println("The bag is full.");
        }
    }

    public void showItems() {
        System.out.println("Items in the bag:");
        for (T item : items) {
            System.out.println(item.toString());
        }
    }
}
