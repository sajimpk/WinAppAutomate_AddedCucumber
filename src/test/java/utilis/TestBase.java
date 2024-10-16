package utilis;

import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.IOException;
import java.net.URL;
import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;

public class TestBase {

    private WindowsDriver driver;

    public WindowsDriver webDriverManager() throws IOException {
        if (driver == null) {
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setCapability("app", "C:\\Program Files\\Notepad++\\notepad++.exe");
            capabilities.setCapability("platformName", "Windows");
            capabilities.setCapability("deviceName", "WindowsPC");
            // Initialize AndroidDriver
             driver = new WindowsDriver<WindowsElement>(new URL("http://127.0.0.1:4723"),capabilities);
            // Perform some actions
            System.out.println("App launched successfully!");
        }
        return driver;
    }

    public void CloseDriver() {
        driver.quit();
    }
}
