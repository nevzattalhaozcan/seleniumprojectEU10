package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task3_GoogleSearch {

    public static void main(String[] args) {

    // TC#3: Google search

        WebDriverManager.chromedriver().setup();

        // 1- Open a Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2- Go to: https://google.com
        driver.get("https://google.com");

        // 3- Write “apple” in search box
        // 4- Hit the enter
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("apple" + Keys.ENTER);

        // 5- Verify title:
        // Expected: Title should start with “apple” word
        String actualTitle = driver.getTitle();
        System.out.println("actualTitle.startsWith(\"apple\") = " + actualTitle.startsWith("apple"));

        driver.close();
    }
}
