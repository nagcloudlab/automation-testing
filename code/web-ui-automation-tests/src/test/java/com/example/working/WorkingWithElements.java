package com.example.working;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithElements {


    static WebDriver driver;

    @BeforeAll
    public static void beforeAll() {
        driver = new ChromeDriver();
        driver.get("http//:google.com");
    }

    @AfterAll
    public static void afterAll() {
        driver.close();
    }

    @Test
    public void workingWithElement(){

        // Find the text input element by its name
        //WebElement element = driver.findElement(By.name("q"));


        // Clear the existing text value using clear method
        //element.clear();

        // Enter something to search for
        //element.sendKeys("Selenium testing tools cookbook");

        // Now submit the form. WebDriver will find
        // the form for us from the element
        //element.submit();

        // Find the button element by its name
        //WebElement element = driver.findElement(By.name("btnG"));
        // Click on the button
        //element.click();


        // Get the message Element
        //WebElement message = driver.findElement(By.id("message"));
        // Get the message elements text
        //String messageText = message.getText();
        // Verify message element's text displays "Click on me and my
        // color will change"
        //Assertions.assertEquals("Click on me and my color will change", messageText);

    }

}
