package abstractfactory;

public class FactoryGenerator {

    public static AbstractFactory getFactory(String choice) {
        return switch (choice) {
            case "PRINTER" -> new PrinterFactory();
            case "SHAPE" -> new ShapeFactory();
            default -> null;
        };
    }
}