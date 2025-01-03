package generics;

public class MainApp{
    public static void main(String[] args) {
        Store<Integer> electronicStore = new Store<>("Electronic Store");

        electronicStore.addProduct(new Product<>(1, "Laptop", 1500.00));
        electronicStore.addProduct(new Product<>(2, "Smartphone", 800.00));
        electronicStore.addProduct(new Product<>(3, "Headphones", 150.00));

        electronicStore.displayInventory();

        electronicStore.removeProductById(2);


        electronicStore.displayInventory();

        double totalValue = electronicStore.calculateTotalValue();
        System.out.println("Total value of products: $" + totalValue);

        Store<String> groceryStore = new Store<>("Grocery Store");

        groceryStore.addProduct(new Product<>("A001", "Milk", 2.50));
        groceryStore.addProduct(new Product<>("A002", "Bread", 1.50));
        groceryStore.addProduct(new Product<>("A003", "Eggs", 3.00));

        groceryStore.displayInventory();
    }
}
