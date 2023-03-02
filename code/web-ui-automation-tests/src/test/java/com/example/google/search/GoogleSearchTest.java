package com.example.google.search;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GoogleSearchTest {

    private WebDriver driver;


    @BeforeEach
    public void setUp() {
        // Launch a new Firefox instance
        driver = new ChromeDriver();
        // Maximize the browser window
        driver.manage().window().maximize();
        // Navigate to Google
        driver.get("http://www.google.com");
    }

    @Test
    public void testGoogleSearch() {
        // Find the text input element by its name
        WebElement element = driver.findElement(By.name("q"));
        // Clear the existing text value
        element.clear();
        // Enter something to search for
        element.sendKeys("Saudi");
        // Now submit the form
        element.submit();
        // Google's search is rendered dynamically with JavaScript.
        // wait for the page to load, timeout after 10 seconds
         new WebDriverWait(driver, Duration.ofSeconds(10)).until(d -> d.getTitle().toLowerCase().equals("Saudi"));
        Assertions.assertEquals("Saudi- Google Search", driver.getTitle());
    }

    @AfterEach
    public void tearDown() throws Exception {
        // Close the browser
        driver.quit();
    }

}
