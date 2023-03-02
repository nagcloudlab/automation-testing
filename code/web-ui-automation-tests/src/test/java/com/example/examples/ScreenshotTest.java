package com.example.examples;


import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class ScreenshotTest {

    WebDriver driver;

    @Before
    public void setUp() {
        driver = new ChromeDriver();
        driver.get("http://nagcloudlab.github.io");
    }

    @Test
    public void testTakesScreenshot() throws Exception {
        File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(scrFile, new File("target/main_page.png"));
    }

    @Test
    public void testElementScreenshot() throws Exception {
        WebElement calc = driver.findElement(By.className("card"));
        FileUtils.copyFile(
                WebElementExtender.captureElementPicture(calc),
                new File("target/calc.png"));
    }

    @After
    public void teadDown() {
        driver.quit();
    }
}