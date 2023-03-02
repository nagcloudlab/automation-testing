package com.example;

import org.junit.jupiter.api.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BankUI {

    static WebDriver webDriver; // this web driver is selenium

    @BeforeAll
    public static void setup() {
        webDriver = new ChromeDriver();
        webDriver.get("http://nagcloudlab.github.io");
    }

    @AfterAll
    public static void destroy() {
        webDriver.close();
    }

    @Test
    public void title() {
        WebElement titleElement = webDriver.findElement(By.className("display-1"));
        String title = titleElement.getText();
        Assertions.assertEquals("my-bank", title);
    }

    @Test
    public void calculatorAdd() {
        WebElement n1Element = webDriver.findElement(By.id("n1"));
        WebElement n2Element = webDriver.findElement(By.id("n2"));
        WebElement opElement = webDriver.findElement(By.id("op"));
        WebElement goElement = webDriver.findElement(By.id("go"));
        WebElement resultElement = webDriver.findElement(By.id("result"));
        n1Element.sendKeys("1");
        n2Element.sendKeys("2");
        goElement.click();
        String actual = resultElement.getText();
        Assertions.assertEquals("30", actual);
    }


}
