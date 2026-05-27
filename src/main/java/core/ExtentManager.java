package core;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getInstance() {
        if (extent == null) {

            ExtentSparkReporter reporter = new ExtentSparkReporter("reports/AutomationReport.html");

            reporter.config().setReportName("Automation Challenge Report");

            reporter.config().setDocumentTitle("Test Results");

            extent = new ExtentReports();
            extent.attachReporter(reporter);
        }

        return extent;
    }
}