package testsApi;

import io.restassured.response.Response;
import org.testng.Assert;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;

public class MercadoLibreApiTest {

        @Test
        public void shouldReturnDepartments() {

            Response response = given()
                    .header(
                            "User-Agent",
                            "Mozilla/5.0"
                    )
                    .header(
                            "Accept",
                            "*/*"
                    )
                    .when()
                    .get("https://www.mercadolibre.com.ar/menu/departments");

            Assert.assertEquals(
                    response.statusCode(),
                    200);

            Assert.assertFalse(
                    response.getBody()
                            .asString()
                            .isEmpty());
    }
}