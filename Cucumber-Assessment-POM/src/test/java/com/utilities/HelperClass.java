package com.utilities;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelperClass {

    private static HelperClass helperClassInstance;
    private static WebDriver driver;

    private HelperClass() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }

    public static void openPage(String url) {
        driver.get(url);
    }

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setupDriver() {
        if (helperClassInstance == null) {
            helperClassInstance = new HelperClass();
        }
    }

    public static void quitDriver() {
        if (driver != null) {
            driver.close();
            driver.quit();
        }
        helperClassInstance = null;
    }
}
