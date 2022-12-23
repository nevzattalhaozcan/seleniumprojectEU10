package com.cydeo.tests.self_study;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementNotInteractableException {

    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://google.com");

        WebElement inputBox = driver.findElement(By.className("gLFyf"));
        inputBox.sendKeys("apple");

        WebElement searchButton = driver.findElement(By.className("gNO89b"));
        searchButton.click();

    }
}
