package helper;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Utility {

    public static WebDriver webDriver;

    public static void startWebDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // For CI CD
        options.addArguments("window-size=1920,1080");
        webDriver = new ChromeDriver(options);
        webDriver .manage().window().fullscreen();
        webDriver.get("https://www.saucedemo.com/");
    }

    public static void quitDriver(){
        webDriver.quit();
    }
}
