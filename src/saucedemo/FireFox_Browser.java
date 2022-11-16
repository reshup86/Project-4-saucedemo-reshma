package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class FireFox_Browser {
    public static void main(String[] args) {

        String baseUrl = "https://www.saucedemo.com/";
        //Set up edge browser
        System.setProperty("webdriver.firefox.driver", "drivers/geckodriver.exe");

        WebDriver driver = new FirefoxDriver();
        //Open URL
        driver.get(baseUrl);
        driver.manage().window().maximize();

        //Implicit
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

        //Get the title of the page
        String title = driver.getTitle();
        System.out.println("Page title is: " + title);

        //Print the current URL
        System.out.println("Current URL is: " + driver.getCurrentUrl());

        //Print the page source
        System.out.println("Page source is: " + driver.getPageSource());

        //Enter the email to email field
        WebElement emailField = driver.findElement(By.id("user-name"));
        emailField.sendKeys("standard_user");

        //Enter the password to password field
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");

        //Close the browser
        //driver.quit();
    }
}
