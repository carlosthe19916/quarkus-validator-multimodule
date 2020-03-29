package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class ExampleResourceTest {

    @Test
    public void testHelloEndpoint() {
        given()
                .body("{\n" +
                        "  \"name\": \"Carlos\",\n" +
                        "  \"address\": {\n" +
                        "    \"street\": \"mi casa\"\n" +
                        "  }\n" +
                        "}\n"
                )
                .header("Content-Type", "application/json")
                .when()
                    .post("/hello")
                .then()
                    .statusCode(400);
    }

}
