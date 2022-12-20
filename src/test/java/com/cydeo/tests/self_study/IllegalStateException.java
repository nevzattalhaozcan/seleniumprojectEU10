package com.cydeo.tests.self_study;

public class IllegalStateException {

    public static void main(String[] args) {

        // This exception is thrown when there is not such a web driver. First, we should set up.
        // But with new version, it works without setting up as seen below

//        WebDriver driver = new ChromeDriver();            works properly
//        WebDriver driver = new EdgeDriver();              works properly
//        WebDriver driver = new InternetExplorerDriver();  works properly


        // I don't have these two on my PC
        // WebDriver driver = new SafariDriver();   throws WebDriverException
        // WebDriver driver = new FirefoxDriver();  throws SessionNotCreatedException



    }
}
