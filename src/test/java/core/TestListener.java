package core;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import utils.ScreenshotUtils;
import java.awt.*;
import java.io.File;


public class TestListener implements ITestListener {

    private static final ExtentReports extent = ExtentManager.getInstance();
    private static final ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    @Override
    public void onTestStart(ITestResult result) {
        ExtentTest extentTest =
                extent.createTest(result.getMethod().getMethodName());

        test.set(extentTest);
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.get().pass("Test passed");
    }


    @Override
    public void onTestFailure(ITestResult result) {
        String screenshotPath = ScreenshotUtils.takeScreenshot(result.getName());
        test.get()
                .fail(result.getThrowable())
                .addScreenCaptureFromPath(screenshotPath);
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
        try {
            Desktop.getDesktop().browse(
                    new File("reports/AutomationReport.html")
                            .toURI());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
