package VandV_Lab;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.openqa.selenium.By.*;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        // Create a new instance of the FireFox driver

        ChromeDriver driver = new ChromeDriver();

        // Open the website
        String appUrl = "https://www.saucedemo.com/";
        driver.get(appUrl);

        // login page
        driver.findElement(id("user-name")).click();
        driver.findElement(id("user-name")).sendKeys("standard_user");
        Thread.sleep(3000);
        id("password").findElement(driver).click();
        driver.findElement(id("password")).sendKeys("secret_sauce");
        Thread.sleep(2500);
        driver.findElement(id("login-button")).click();
        Thread.sleep(2000);

        driver.findElement(id("add-to-cart-sauce-labs-backpack")).click();
        Thread.sleep(3000);
        driver.findElement(id("add-to-cart-sauce-labs-fleece-jacket")).click();
        Thread.sleep(3000);

        driver.findElement(id("shopping_cart_container")).click();
        Thread.sleep(3000);

        driver.findElement(id("checkout")).click();
        Thread.sleep(3000);

        driver.findElement(id("first-name")).click();
        driver.findElement(id("first-name")).sendKeys("Nafizur");
        Thread.sleep(2500);
        driver.findElement(id("last-name")).click();
        driver.findElement(id("last-name")).sendKeys("Rahman");
        Thread.sleep(2800);
        driver.findElement(id("postal-code")).sendKeys("1604");
        Thread.sleep(2800);
        driver.findElement(id("continue")).click();
        Thread.sleep(3000);
        driver.findElement(id("finish")).click();
        Thread.sleep(3000);

        // Close browser
        driver.close();
    }
}
