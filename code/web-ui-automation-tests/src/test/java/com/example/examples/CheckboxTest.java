package com.example.examples;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Ex2 {


    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("http://cookbook.seleniumacademy.com/Config.html");
    }

    @Test
    public void testCheckBox() {

        //Get the Checkbox as WebElement using it's value attribute
        WebElement airbags = driver.findElement(By.xpath("//input[@value='Airbags']"));

        //Check if its already selected? otherwise select the Checkbox
        //by calling click() method
        if (!airbags.isSelected()) {
            airbags.click();
        }

        //Verify Checkbox is Selected
        assertTrue(airbags.isSelected());

        //Check Checkbox if selected? If yes, deselect it
        //by calling click() method
        if (airbags.isSelected()) {
            airbags.click();
        }

        //Verify Checkbox is Deselected
        assertFalse(airbags.isSelected());
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

}
