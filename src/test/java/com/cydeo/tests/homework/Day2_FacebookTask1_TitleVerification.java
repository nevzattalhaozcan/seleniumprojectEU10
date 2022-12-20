package com.cydeo.tests.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_FacebookTask1_TitleVerification {

    public static void main(String[] args) {

    // TC #1: Facebook title verification

        WebDriverManager.chromedriver().setup();

        // 1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");

        // 3. Verify title:
        // Expected: “Facebook - Log In or Sign Up”
        String actualTitle = driver.getTitle(); // Facebook – log in or sign up
        String expectedTitle = "Facebook - Log In or Sign Up";

        System.out.println("actualTitle.equals(expectedTitle) = " + actualTitle.equals(expectedTitle)); // compares and prints

        driver.quit();
    }
}
