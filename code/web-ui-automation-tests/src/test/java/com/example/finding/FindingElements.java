package com.example.finding;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingElements {

    static WebDriver driver;

    @BeforeAll
    public static void beforeAll() {
        driver = new ChromeDriver();
        driver.get("http://nagcloudlab.github.io");
    }

    @AfterAll
    public static void afterAll() {
        driver.close();
    }

    @Test
    public void findingElements() {

        //-------------------------------------------------------------------
        // way-1:
        //-------------------------------------------------------------------
        //WebElement element=driver.findElement(By.tagName(""));
        //WebElement element=driver.findElement(By.id(""));
        //WebElement element=driver.findElement(By.className(""));
        //WebElement element=driver.findElement(By.name());

        //-------------------------------------------------------------------
        //way-2: Link Text
        //-------------------------------------------------------------------
        //WebElement element=driver.findElement(By.linkText("Gmail"));
        //Assertions.assertEquals("https://mail.google.com/mail/&ogbl",element.getAttribute("href"));

        //-------------------------------------------------------------------
        //way-3: Partial Link Text
        //-------------------------------------------------------------------
        //WebElement element=driver.findElement(By.partialLinkText("Gm"));
        //Assertions.assertEquals("https://mail.google.com/mail/&ogbl",element.getAttribute("href"));


        //-------------------------------------------------------------------
        //way-4: css selector(s) // reference : https://www.w3schools.com/cssref/trysel.php
        //-------------------------------------------------------------------
        //WebElement element=driver.findElement(By.cssSelector("#id"));
        //WebElement element=driver.findElement(By.cssSelector(".class-name"));
        //WebElement element=driver.findElement(By.cssSelector("#login-box #go"));
        //WebElement element=driver.findElement(By.cssSelector("#login-box input:first-of-type"));

        //e.g
        //WebElement titleElement=driver.findElement(By.cssSelector(".row .card .card-header"));
        //Assertions.assertEquals("calculator",titleElement.getText());


        //List<WebElement> divElements = driver.findElements(By.cssSelector("div"));
        //Assertions.assertEquals(9, divElements.size());

        //-------------------------------------------------------------------
        //way-5: Xpath
        //-------------------------------------------------------------------
        //WebElement titleElement=driver.findElement(By.xpath("/htmlbody/div/div[2]/div[1]/div/div[1]"));
        //Assertions.assertEquals("calculator",titleElement.getText());

        //WebElement userNameElement=driver.findElement(By.xpath("//input[@id='username']"));
        //WebElement passwordElement=driver.findElement(By.xpath("//input[@id='password']"));
    }



}
