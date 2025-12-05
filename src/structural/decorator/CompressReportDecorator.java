package structural.decorator;

import java.util.Base64;

public class CompressReportDecorator extends ReportDecorator {
    public CompressReportDecorator(ReportService service) {
        super(service);
    }

    @Override
    public String report() {
        String result = super.report();
        String compressed = Base64.getEncoder().encodeToString(result.getBytes());
        return compressed + " | Compressed 🔐";
    }
}