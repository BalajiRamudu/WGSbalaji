package api.customer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    public static void openBrowser(){
        System.setProperty("webdriver.chrome.driver","Drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.google.co.in/");
        driver.quit();
    }
}
