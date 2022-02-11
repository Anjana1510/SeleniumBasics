package seleniumhomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\jalpe\\IdeaProjects\\Software\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.google.co.uk");

        String title = driver.getTitle();
        System.out.printf(title);

        Thread.sleep(3000);
        driver.close();
    }
}
