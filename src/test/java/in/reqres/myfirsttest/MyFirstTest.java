package in.reqres.myfirsttest;

import in.reqres.testbase.TestBase;
import io.restassured.response.Response;
import org.junit.Test;

import static io.restassured.RestAssured.given;

public class MyFirstTest extends TestBase {
    @Test
    public void getAllUserInfo(){
//        given()
//                .when()
//                .get("https://reqres.in/api/users?page=2")
//                .then()
//                .statusCode(200);

        Response response = given()
                .when()
                .get("/users");
                response.then().statusCode(200);
                response.prettyPrint();



    }

}
