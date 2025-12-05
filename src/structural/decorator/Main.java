package structural.decorator;

public class Main {

    public static void main(String[] args) {

        ReportService service = new SimpleReportService();

        service = new TimeReportDecorator(new LogReportDecorator(new CompressReportDecorator(service)));

        System.out.println(service.report());
    }
}