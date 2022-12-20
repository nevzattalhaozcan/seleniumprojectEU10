package com.cydeo.tests.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_TC3_BackAndForthNavigation {

    public static void main(String[] args) throws InterruptedException {

    // TC #3: Back and forth navigation

        WebDriverManager.chromedriver().setup();

        // 1- Open a Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2- Go to: https://google.com
        driver.get("https://google.com");

        // 3- Click to Gmail from top right.
        WebElement gmail = driver.findElement(By.linkText("Gmail"));
        gmail.click();

        // 4- Verify title contains:
        // Expected: Gmail
        String actualTitleGmail = driver.getTitle();
        String expectedTitleGmail = "Gmail";

        System.out.println("actualTitleGmail.contains(expectedTitleGmail) = " + actualTitleGmail.contains(expectedTitleGmail)); // compares and prints

        // 5- Go back to Google by using the .back();
        driver.navigate().back();

        // 6- Verify title equals:
        // Expected: Google
        String actualTitleGoogle = driver.getTitle();
        String expectedTitleGoogle = "Google";

        System.out.println("actualTitleGoogle.equals(expectedTitleGoogle) = " + actualTitleGoogle.equals(expectedTitleGoogle)); // compares and prints

        driver.quit();
    }
}
