package com.cydeo.tests.self_study;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1_Etsy_NuSeAccessory {

    public static void main(String[] args) {

        // sets up the web driver
        WebDriverManager.chromedriver().setup();

        // creates the instance of the driver
        WebDriver driver = new ChromeDriver();

        // goes to the Etsy home page
        driver.get("https://www.etsy.com");

        // maximizes the page
        driver.manage().window().maximize();

        // gets the URL of the page
        String actualURL = driver.getCurrentUrl();
        String etsyURL = "https://www.etsy.com/"; // expected

        // gets the title of the page
        String actualTitle = driver.getTitle();
        String etsyTitle = "Etsy Turkey - Shop for handmade, vintage, custom, and unique gifts for everyone"; // expected

        // checking home URL and title
        boolean homeCheckURL = actualURL.equals(etsyURL);
        boolean homeCheckTitle = actualTitle.equals(etsyTitle);

        // goes to the NuSeAccessory
        driver.navigate().to("https://www.etsy.com/shop/NuSeAccessory?ref=profile_header");

        // gets the URL
        actualURL = driver.getCurrentUrl();
        String nuseURL = "https://www.etsy.com/shop/NuSeAccessory?ref=profile_header"; // expected

        // gets the title
        actualTitle = driver.getTitle();
        String nuseTitle = "NuSeAccessory - Etsy Turkey"; // expected

        // checking the NuSeAccessory URL and title
        boolean nuseCheckURL = actualURL.equals(nuseURL);
        boolean nuseCheckTitle = actualTitle.equals(nuseTitle);

        // checks refreshing, forward, backward responds
        driver.navigate().refresh();
        driver.navigate().back();
        driver.navigate().forward();

        // closes the window
        driver.close();

        // prints the result
        System.out.println("homeCheckURL = " + homeCheckURL);
        System.out.println("homeCheckTitle = " + homeCheckTitle);
        System.out.println("nuseCheckURL = " + nuseCheckURL);
        System.out.println("nuseCheckTitle = " + nuseCheckTitle);


    }
}
