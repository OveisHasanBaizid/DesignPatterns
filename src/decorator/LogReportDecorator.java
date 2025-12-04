package decorator;

public class LogReportDecorator extends ReportDecorator {

    public LogReportDecorator(ReportService service) {
        super(service);
    }

    @Override
    public String report() {
        String result = super.report();
        return result + " | Logged ✔";
    }
}