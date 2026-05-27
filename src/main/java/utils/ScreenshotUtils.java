package utils;

import core.DriverManager;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

public class ScreenshotUtils {

    public static String takeScreenshot(String testName) {
        File folder = new File("screenshots");

        if (!folder.exists()) {
            folder.mkdirs();
        }

        File source = ((TakesScreenshot) DriverManager.getDriver()).getScreenshotAs(OutputType.FILE);

        String destination =
                System.getProperty("user.dir")
                        + "/screenshots/"
                        + testName
                        + ".png";
        try {
            FileUtils.copyFile(source, new File(destination));

        } catch (IOException e) {
            e.printStackTrace();
        }
        return new File(destination).getAbsolutePath();
    }
}
