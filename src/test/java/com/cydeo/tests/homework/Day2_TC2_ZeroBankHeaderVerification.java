package com.cydeo.tests.homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day2_TC2_ZeroBankHeaderVerification {

    public static void main(String[] args) {

    // TC #2: Zero Bank header verification

        WebDriverManager.chromedriver().setup();

        // 1. Open Chrome browser
        WebDriver driver = new ChromeDriver();

        // 2. Go to http://zero.webappsecurity.com/login.html
        driver.get("http://zero.webappsecurity.com/login.html");

        // 3. Verify header text
        // Expected: “Log in to ZeroBank”
        WebElement headerElement = driver.findElement(By.tagName("h3"));
        String actualHeader = headerElement.getText();
        String expectedHeader = "Log in to ZeroBank";
        System.out.println("actualHeader.equals(expectedHeader) = " + actualHeader.equals(expectedHeader));

        driver.close();
    }
}
