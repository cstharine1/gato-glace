public class Product {
    private static long nextId = 1;

    private long id;
    private String name;
    private String category; // "Doce" ou "Café"
    private double price;

    public Product(String name, String category, double price) {
        this.id = nextId++;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCategory() {
        return category;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return String.format("ID: %d | %s (%s) - R$ %.2f", id, name, category, price);
    }
}
// CATHARINE E MARIA EDUARDA