package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_CydeoVerifications {

    public static void main(String[] args) {

    // TC #1: Cydeo practice tool verifications

        // Set up WebDriverManager
        WebDriverManager.chromedriver().setup();

        // 1. Open Chrome browser
        // Create instance of the driver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");

        // 3. Verify URL contains
        // Expected: cydeo
        String actualURL = driver.getCurrentUrl();
        System.out.println("actualURL.contains(\"cydeo\") = " + actualURL.contains("cydeo"));

        // 4. Verify title:
        // Expected: Practice
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle.equals(\"Practice\") = " + actualTitle.equals("Practice"));

        driver.close();
    }
}
