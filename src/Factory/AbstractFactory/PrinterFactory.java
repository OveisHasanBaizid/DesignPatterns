package Factory.AbstractFactory;

public class PrinterFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    Printer getPrinter(String type) {
        if (type == null)
            return null;
        return switch (type) {
            case "PAPER" -> new PaperPrinter();
            case "WEB" -> new WebPrinter();
            case "SCREEN" -> new ScreenPrinter();
            default -> null;
        };
    }
}
