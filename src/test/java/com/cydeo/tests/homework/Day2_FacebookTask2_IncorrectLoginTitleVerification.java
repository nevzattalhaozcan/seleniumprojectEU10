package com.cydeo.tests.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_FacebookTask2_IncorrectLoginTitleVerification {

    public static void main(String[] args) {

    // TC #2: Facebook incorrect login title verification

        WebDriverManager.chromedriver().setup();

        // 1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        // 3. Enter incorrect username
        WebElement usernameBox = driver.findElement(By.id("email"));
        usernameBox.sendKeys("incorrect");

        // 4. Enter incorrect password
        WebElement passwordBox = driver.findElement(By.id("pass"));
        passwordBox.sendKeys("incorrect");

        WebElement loginButton = driver.findElement(By.name("login"));
        loginButton.click();

        // 5. Verify title changed to:
        // Expected: “Log into Facebook”
        String actualTitle = driver.getTitle(); // Log in to Facebook
        String expectedTitle = "Log into Facebook";

        System.out.println("actualTitle.equals(expectedTitle) = " + actualTitle.equals(expectedTitle)); // compares and prints

        driver.quit();
    }
}
