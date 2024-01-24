package Factory.FactoryMethod;

public class Main {
    public static void main(String[] args) throws Exception {
        ProductFactory productFactory = new ProductFactory();
        productFactory.createProduct("book"
                , "The Lord of the Rings", 20, "A classic fantasy novel.");
    }
}
