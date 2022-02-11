package seleniumhomework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Edge {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver","C:\\Users\\jalpe\\IdeaProjects\\Software\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.tesco.com/");
        String title = driver.getTitle();
        System.out.println(title);

        if(title.equals("Tesco - Supermarkets | Online Groceries, Clubcard & Recipes"))
            System.out.println("Correct title");
        else
            System.out.println("Incorrect title");

        Thread.sleep(2000);
        driver.close();
    }
}
