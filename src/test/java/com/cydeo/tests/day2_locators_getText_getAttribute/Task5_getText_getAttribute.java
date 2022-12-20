package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task5_getText_getAttribute {

    public static void main(String[] args) {

    // TC #5: getText() and getAttribute() method practice

        WebDriverManager.chromedriver().setup();

        // 1- Open a Chrome browser
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // 2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");

        // 3- Verify header text is as expected:
        // Expected: Registration form
        WebElement header = driver.findElement(By.tagName("h2"));
        String actualHeader = header.getText();
        System.out.println("actualHeader.equals(\"Registration form\") = " + actualHeader.equals("Registration form"));

        // 4- Locate “First name” input box
        WebElement firstNameBox = driver.findElement(By.className("form-control"));

        // 5- Verify placeholder attribute’s value is as expected:
        // Expected: first name
        String actualPlaceHolder = firstNameBox.getAttribute("placeholder");
        System.out.println("actualPlaceHolder.equals(\"first name\") = " + actualPlaceHolder.equals("first name"));

        driver.close();
    }
}
