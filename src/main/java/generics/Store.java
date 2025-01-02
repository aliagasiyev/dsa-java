package generics;
import java.util.ArrayList;
import java.util.List;

class Store<T> {
    private final String name;
    private final List<Product<T>> inventory;

    public Store(String name) {
        this.name = name;
        this.inventory = new ArrayList<>();
    }

    public void addProduct(Product<T> product) {
        inventory.add(product);
        System.out.println("Product added: " + product);
    }

    public void removeProductById(T id) {
        inventory.removeIf(product -> product.getId().equals(id));
        System.out.println("Product with ID " + id + " removed.");
    }

    public void displayInventory() {
        System.out.println("Inventory of " + name + ":");
        inventory.forEach(System.out::println);
    }

    public double calculateTotalValue() {
        return inventory.stream().mapToDouble(Product::getPrice).sum();
    }
}
