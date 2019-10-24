package client;
import io.restassured.response.ValidatableResponse;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;

public class RqsClientGet {
    protected final static String BASE_URI = "https://reqres.in";
    protected final static String ENDPOINT_URI = "/api/users?page=2";
    protected final static String FINAL_URI= BASE_URI+ENDPOINT_URI;

    public ValidatableResponse getPost (){
        return given()
                .when().post(FINAL_URI).then();


    }




}


