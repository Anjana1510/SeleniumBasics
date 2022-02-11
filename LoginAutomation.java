package seleniumhomework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import sun.font.DelegatingShape;

public class LoginAutomation {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\jalpe\\IdeaProjects\\Software\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();

        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        Thread.sleep(2000);

        String title = driver.getTitle();
        System.out.println(title);

       driver.findElement(By.className("ico-login")).click();
       WebElement email = driver.findElement(By.id("Email"));
       email.sendKeys("borad.anju@gmail.com");

       WebElement password = driver.findElement(By.id("Password"));
       password.sendKeys("Practice_1234");
       Thread.sleep(1000);

       driver.findElement(By.className("login-button")).click();

     WebElement element = driver.findElement(By.className("validation-summary-errors"));
     String data = element.getText();
        //System.out.println(data);

      if(data.equals("Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found")) {
          driver.findElement(By.className("register-button")).click();
      } else {
              System.out.println("successful Login ");
      }
      Thread.sleep(3000);
      driver.close();
    }
}
