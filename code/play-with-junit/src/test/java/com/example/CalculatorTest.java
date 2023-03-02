package com.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.time.Duration;
import java.time.LocalTime;

import static org.junit.jupiter.api.Assertions.*;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

// Junit Test Suite/Fixture

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CalculatorTest {

    Calculator calculator;

    @BeforeAll
    public static void beforeAll() {
        // Todo any initialization before all test methods
        System.out.println("beforeAll()");
    }

    @AfterAll
    public static void afterAll() {
        // Todo any initialization after all test methods
        System.out.println("afterAll()");
    }

    @BeforeEach
    public void beforeEach() {
        // Todo any initialization before each test method
        System.out.println("beforeEach()");
        calculator = new Calculator(); // Arrange
    }

    @AfterEach
    public void afterEach() {
        // Todo any cleanup after each test method
        System.out.println("afterEach()");
    }

    @Test
    @DisplayName("calculator-add-test")
    @Order(1)
    public void addTest() {
        System.out.println("addTest()");
        int actual = calculator.add(12, 13); // Act
        int expected = 25;
        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("calculator-sub-test")
    @Order(2)
    public void subTest() {
        System.out.println("subTest");
        int actual = calculator.sub(12, 13); // Act
        int expected = -1;
        assertEquals(expected, actual, "sub test not passing"); // Assert
    }


    @Test
    @Order(3)
    public void assertions() {

//        assertEquals(1,2);

//        assertAll("number check",
//                ()-> assertEquals(1,1),
//                ()-> assertEquals(2,2)
//        );
//
//        Exception exception = assertThrows(ArithmeticException.class, () ->
//                calculator.div(1, 0));
//        assertEquals("/ by zero", exception.getMessage());

//        assertTimeout(Duration.ofSeconds(5), () -> {
//            calculator.complexCalc(12,13);
//        });


        // Third-party's assertions ( e.g hamcrest )
//         assertThat(calculator.sub(4, 1), is(equalTo(3)));


    }


    @Test
    @Order(3)
    @EnabledOnOs(OS.MAC)
    public void assumptions() {
        assertTrue(true);
    }

    @Test
    @Disabled
    public void fooTest() {
        // ...
        assertTrue(true);
    }


    @RepeatedTest(10)
    void repeatedTest() {
        // ...
    }

    /*
        1+2 = 3
        10+20 = 30
        100+200 = 300
     */

    @ParameterizedTest
    @CsvFileSource(files = "/Users/nag/automation-testing/code/play-with-junit/src/test/java/com/example/test-data.csv", numLinesToSkip = 1)
    public void csvFileTest(int n1, int n2, int expected) {
        int actual = calculator.add(n1, n2);
        assertEquals(expected, actual);
    }


    @Test
    public void testItAfterOnePM(){
        Assumptions.assumeTrue(LocalTime.now().getHour()>10);
        //..
        assertEquals(1,2);
    }

}
