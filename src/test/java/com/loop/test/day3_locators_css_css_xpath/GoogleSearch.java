package com.loop.test.day3_locators_css_css_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleSearch {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/ ");

        driver.manage().window().maximize();
        String expectedUrl= "Google";
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.contains(expectedUrl)) {
            System.out.println("Actual title" + actualUrl + "matches expected title" + expectedUrl + "=> Test pass");

        }else {
            System.err.println("actual title: " + actualUrl + "doesnt match expected title: " + expectedUrl + "=> test fail");
        }

        driver.quit();




    }
}
