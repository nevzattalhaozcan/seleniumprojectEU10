package com.cydeo.tests.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_TC4_PracticeCydeoClassLocatorPractice {

    public static void main(String[] args) {

    // TC #4: Practice Cydeo – Class locator practice

        WebDriverManager.chromedriver().setup();

        // 1- Open a Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");

        // 3- Click to “Home” link
        WebElement homeLink = driver.findElement(By.className("nav-link"));
        homeLink.click();

        // 4- Verify title is as expected:
        // Expected: Practice
        String actualTitle = driver.getTitle();
        String expectedTitle = "Practice";

        System.out.println("actualTitle.equals(expectedTitle) = " + actualTitle.equals(expectedTitle)); // compares and prints

        // PS: Locate “Home” link using “className” locator

        driver.quit();
    }
}
