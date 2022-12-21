package com.cydeo.tests.self_study;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class NoSuchElementException extends DriverSetupUtility{

    public static void main(String[] args) {

        setup();

        driver.get("https://www.google.com");

//        driver.findElement(By.className("gNO89b"));

        By locator = By.className("gNO89b");

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));

        WebElement searchButton = driver.findElement(locator);



    }
}
