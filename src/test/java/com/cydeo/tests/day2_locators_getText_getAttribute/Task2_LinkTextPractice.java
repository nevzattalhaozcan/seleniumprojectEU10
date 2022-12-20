package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task2_LinkTextPractice {

    public static void main(String[] args) throws InterruptedException {

    // TC #2: Back and forth navigation

        // Set up WebDriverManager
        WebDriverManager.chromedriver().setup();

        // 1- Open a Chrome browser
        // Create an instance of the WebDriverManager
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2- Go to: https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");

        // 3- Click to A/B Testing from top of the list.
        // driver.findElement(By.linkText("A/B Testing")).click(); // it is not a good practice not to store this data
        WebElement abTestingLink = driver.findElement(By.linkText("A/B Testing")); // stores the link as an element
        abTestingLink.click();
         
        // 4- Verify title is:
        // Expected: No A/B Test
        String actualTitleAB = driver.getTitle();
        System.out.println("actualTitle.equals(\"No A/B Test\") = " + actualTitleAB.equals("No A/B Test"));

        // 5- Go back to home page by using the .back();
        driver.navigate().back();

        // 6- Verify title equals:
        // Expected: Practice
        String actualTitleHome = driver.getTitle();
        System.out.println("actualTitleHome.equals(\"Practice\") = " + actualTitleHome.equals("Practice"));

        driver.close();
    }

}
