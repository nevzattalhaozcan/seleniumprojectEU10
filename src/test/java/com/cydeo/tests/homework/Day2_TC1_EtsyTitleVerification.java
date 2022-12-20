package com.cydeo.tests.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_TC1_EtsyTitleVerification {

    public static void main(String[] args) {

    // TC #1: Etsy Title Verification

        WebDriverManager.chromedriver().setup();

        // 1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com");

        // 3. Search for “wooden spoon”
        WebElement searchBox = driver.findElement(By.id("global-enhancements-search-query"));
        searchBox.sendKeys("wooden spoon" + Keys.ENTER);

        // 4. Verify title:
        // Expected: “Wooden spoon | Etsy”
        String actualTitle = driver.getTitle(); // Wooden spoon - Etsy
        String expectedTitle = "Wooden spoon | Etsy";

        System.out.println("actualTitle.equals(expectedTitle) = " + actualTitle.equals(expectedTitle));

        driver.close();
    }
}
