package HWSeleniumClass09;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import javax.imageio.ImageIO;
import java.io.File;

public class ScreenShotCommonMethods {

    public static void take(WebDriver webdriver, String path) throws Exception {

        File scrFile = ((TakesScreenshot) webdriver).getScreenshotAs(OutputType.FILE);

        ImageIO.write(ImageIO.read(scrFile), "png", new File(path));
    }
}
