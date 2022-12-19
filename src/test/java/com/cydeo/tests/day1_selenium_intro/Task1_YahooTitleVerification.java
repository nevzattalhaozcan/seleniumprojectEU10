package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1_YahooTitleVerification {

    public static void main(String[] args) throws InterruptedException {

        // Set up web driver
        WebDriverManager.chromedriver().setup();

        // Create instance of WebDriver
        WebDriver driver = new ChromeDriver();

        // goes to the yahoo website
        driver.get("https://www.yahoo.com");
        driver.manage().window().maximize(); // no need to maximize to check the title, I think

        // gets the url
        String actualURL = driver.getTitle();

        // close the window
        driver.close(); // .quit() is also possible
        // after the line above, we cannot use driver variable

        // this is the url we expect to see on the page
        String expectedURL = "Yahoo | Mail, Weather, Search, Politics, News, Finance, Sports & Videos";

        // compares expected and actual and prints the result
        if(actualURL.equals(expectedURL)){
            System.out.println("Title is as expected. Verification PASSED!");
        }else{
            System.err.println("Title is NOT passed. Verification FAILED!");
        }

    }
}
