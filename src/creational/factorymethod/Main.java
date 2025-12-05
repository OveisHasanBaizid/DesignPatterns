package creational.factorymethod;

public class Main {

    public static void main(String[] args) throws Exception {

        String name = "The Lord of the Rings";
        int price = 20;
        String description = "A classic fantasy novel.";

        ProductFactory productFactory = new ProductFactory();
        productFactory.createProduct("book", name, price, description);
    }
}
