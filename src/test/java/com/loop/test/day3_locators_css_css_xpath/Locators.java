package com.loop.test.day3_locators_css_css_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
         driver.manage().window().maximize();

        WebElement searchBoxWithID = driver.findElement(By.id("APjFqb"));
         String textToSearch = "Free Palestine";
         searchBoxWithID.sendKeys(textToSearch+ Keys.ENTER );



    }
}
