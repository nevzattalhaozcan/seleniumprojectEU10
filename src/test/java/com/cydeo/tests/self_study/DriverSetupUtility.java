package com.cydeo.tests.self_study;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetupUtility {

    static WebDriver driver;

    public static void setup(){

        // sets up the web driver
        WebDriverManager.chromedriver().setup();
        // creates an instance of the driver
        driver = new ChromeDriver();
        // maximizes the window
        driver.manage().window().maximize();

    }

}
