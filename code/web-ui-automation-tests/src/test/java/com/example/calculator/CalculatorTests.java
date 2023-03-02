package com.example.calculator;

import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculatorTests {

    static WebDriver driver;

    WebElement n1Ele;
    WebElement n2Ele;
    WebElement opEle;
    WebElement goEle;
    WebElement resultEle;

    // Arrange
    @BeforeAll
    public static void beforeAll() {
        driver = new ChromeDriver();
        driver.get("https://nagcloudlab.github.io/");
    }

    @AfterAll
    public static void afterAll() {
        driver.close();
    }


    @BeforeEach
    public void beforeEach() {
        n1Ele = driver.findElement(By.id("n1"));
        n2Ele = driver.findElement(By.id("n2"));
        opEle = driver.findElement(By.id("op"));
        goEle = driver.findElement(By.id("go"));
        resultEle = driver.findElement(By.id("result"));
    }


    @AfterEach
    public void afterEach() {
        n1Ele.clear();
        n2Ele.clear();
    }

    @Test
    @Tag("bank-v1")
    public void pageTitleTest() {
        // Act
        WebElement titleElement = driver.findElement(By.className("display-1"));
        String actual = titleElement.getText();
        String expected = "my-bank";
        // Assert
        Assertions.assertEquals(expected, actual);
    }


    @Test
    @Tag("bank-v1")
    public void addTest() {
        n1Ele.sendKeys("10");
        n2Ele.sendKeys("20");
        goEle.click();
        String actual = resultEle.getText();
        String expected = "30";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void subTest() {
        n1Ele.sendKeys("10");
        n2Ele.sendKeys("20");
        opEle.sendKeys("-");
        goEle.click();
        String actual = resultEle.getText();
        String expected = "-10";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void mulTest() {
        n1Ele.sendKeys("10");
        n2Ele.sendKeys("20");
        opEle.sendKeys("*");
        goEle.click();
        String actual = resultEle.getText();
        String expected = "200";
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void divTest() {
        n1Ele.sendKeys("10");
        n2Ele.sendKeys("20");
        opEle.sendKeys("/");
        goEle.click();
        String actual = resultEle.getText();
        String expected = "0.5";
        Assertions.assertEquals(expected, actual);
    }








}
