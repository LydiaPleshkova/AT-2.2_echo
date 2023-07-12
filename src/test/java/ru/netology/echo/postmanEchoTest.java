package ru.netology.echo;

import org.junit.jupiter.api.Test;

public class postmanEchoTest {

    @Test
    void shouldReturnSentData() {
        given()
                .baseUri("https://postman-echo.com")
                .body("Hello")
                .when()
                .post("/post")
                .then()
                .statusCode(200)
                .body("data", equalTo("Hello"));
    }
}
