package Factory.FactoryMethod;

public class Clothing implements Product{
    private String name;
    private int price;
    private String description;

    public Clothing(String name, int price, String description) {
        this.name = name;
        this.price = price;
        this.description = description;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getPrice() {
        return price;
    }

    @Override
    public String getDescription() {
        return description;
    }
}
