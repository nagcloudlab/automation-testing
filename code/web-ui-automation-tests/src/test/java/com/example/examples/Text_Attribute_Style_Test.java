package com.example.examples;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text_Attribute_Style_Test {

    static WebDriver driver;

    @BeforeAll
    public static void setUp() {
        driver = new ChromeDriver();
        driver.get("http://cookbook.seleniumacademy.com/DoubleClickDemo.html");
    }

    @Test
    public void testElementText() {

        // Get the message Element
        WebElement message = driver.findElement(By.id("message"));

        // Get the message elements text
        String messageText = message.getText();

        // Verify message element's text displays
        // "Click on me and my color will change"
        Assertions.assertEquals("Click on me and my color will change", messageText);

        // Get the area Element
        WebElement area = driver.findElement(By.id("area"));

        // Verify area element's text displays "Div's Text\nSpan's Text"
        Assertions.assertEquals("Div's Text\nSpan's Text", area.getText());
    }

    @Test
    public void testElementAttribute() {
        WebElement message = driver.findElement(By.id("message"));
        Assertions.assertEquals("justify", message.getAttribute("align"));
    }

    @Test
    public void testElementStyle() {
        WebElement message = driver.findElement(By.id("message"));
        String width = message.getCssValue("background");
        Assertions.assertEquals("rgb(0, 0, 255)", width);
    }

    @AfterAll
    public static void tearDown() {
        driver.close();
    }
}
