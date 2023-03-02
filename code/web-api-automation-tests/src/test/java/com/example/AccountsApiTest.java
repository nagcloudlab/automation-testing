package com.example;

import static io.restassured.RestAssured.*;

import static org.junit.jupiter.api.Assertions.*;

import io.restassured.response.Response;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


public class AccountsApiTest {

    @BeforeAll
    public static void setup() {
        baseURI = "http://localhost:8080/api";
    }

    @Test
    public void getAccounts() {

        Response response =
                given()
                        .header("Accept", "application/json")
                        .and()
                        .when()
                        .get("/accounts")
                        .then()
                        .extract().response();

//        assertEquals(200,response.statusCode());
//        assertEquals("application/json",response.header("Content-Type"));
//        assertEquals(response.jsonPath().getList("$").size(), 2);

    }

}
