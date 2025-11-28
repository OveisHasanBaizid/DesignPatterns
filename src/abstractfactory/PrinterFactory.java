package abstractfactory;

public class PrinterFactory extends AbstractFactory {

    @Override
    public Shape getShape(String shapeType) {
        return null;
    }

    @Override
    Printer getPrinter(String type) {
        return switch (type) {
            case "PAPER" -> new PaperPrinter();
            case "WEB" -> new WebPrinter();
            case "SCREEN" -> new ScreenPrinter();
            default -> null;
        };
    }
}