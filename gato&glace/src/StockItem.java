public class StockItem {
    private Product product;
    private int quantity;

    public StockItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void addQuantity(int amount) {
        this.quantity += amount;
    }

    public void removeQuantity(int amount) {
        this.quantity -= amount;
        if (this.quantity < 0) this.quantity = 0;
    }

    @Override
    public String toString() {
        return String.format("%s | Estoque: %d", product.toString(), quantity);
    }
}//JOSE WILSON E BRYAN 
