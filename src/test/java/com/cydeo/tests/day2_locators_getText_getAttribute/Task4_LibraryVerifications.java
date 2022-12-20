package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task4_LibraryVerifications {

    public static void main(String[] args) throws InterruptedException {

    // TC #4: Library verifications

        WebDriverManager.chromedriver().setup();

        // 1. Open Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2. Go to http://library2.cybertekschool.com/login.html
        driver.get("http://library2.cybertekschool.com/login.html");

        // 3. Enter username: “incorrect@email.com”
        WebElement usernameBox = driver.findElement(By.className("form-control"));
        usernameBox.sendKeys("incorrect@email.com");

        // 4. Enter password: “incorrect password”
        WebElement passwordBox = driver.findElement(By.id("inputPassword"));
        passwordBox.sendKeys("incorrect password");

        // 5. Verify: visually “Sorry, Wrong Email or Password” displayed
        WebElement signInButton = driver.findElement(By.tagName("button"));
        signInButton.click();
        Thread.sleep(3000);

        driver.close();

        //PS: Locate username input box using “className” locator
        //    Locate password input box using “id” locator
        //    Locate Sign in button using “tagName” locator

    }
}
