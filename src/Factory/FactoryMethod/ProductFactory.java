package Factory.FactoryMethod;

public class ProductFactory {
    public Product createProduct(String type, String name, int price, String description)
            throws Exception {
        return switch (type) {
            case "book" -> new Book(name, price, description);
            case "clothing" -> new Clothing(name, price, description);
            default -> throw new Exception("Invalid product type.");
        };
    }
}
