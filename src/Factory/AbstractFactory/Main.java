package Factory.AbstractFactory;

public class Main {
    public static void main(String[] args) {

        AbstractFactory shapeFactory = FactoryGenerator.getFactory("SHAPE");
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
        Shape shape3 = shapeFactory.getShape("SQUARE");
        shape3.draw();

        AbstractFactory printerFactory = FactoryGenerator.getFactory("printer");
        Printer printer1 = printerFactory.getPrinter("Paper");
        printer1.print();
        Printer printer2 = printerFactory.getPrinter("Web");
        printer2.print();
        Printer printer3 = printerFactory.getPrinter("Screen");
        printer3.print();

    }
}