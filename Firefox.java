package seleniumhomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefox {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver","C:\\Users\\jalpe\\IdeaProjects\\Software\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();

        driver.get("https://github.com/");
        String title = driver.getTitle();
        System.out.println(title);

        String s = driver.getCurrentUrl();
        System.out.println(s);

        driver.get("https://www.google.co.uk/");
        driver.navigate().forward();

        Thread.sleep(2000);
        driver.close();
    }
}
