package structural.decorator;

public class TimeReportDecorator extends ReportDecorator {

    public TimeReportDecorator(ReportService service) {
        super(service);
    }

    @Override
    public String report() {
        long start = System.nanoTime();
        String result = super.report();
        long end = System.nanoTime();
        return result + " | Generated in: " + (end - start) + " ns";
    }
}