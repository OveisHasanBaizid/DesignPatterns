package Factory.AbstractFactory;

public class WebPrinter implements Printer{
    @Override
    public void print() {
        System.out.println("web");
    }
}
