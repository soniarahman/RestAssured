package client;
import io.restassured.response.ValidatableResponse;
import static io.restassured.RestAssured.*;
import static org.hamcrest.Matcher.*;
import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.hasSize;

public class RqsClientPost {
    protected final static String BASE_URI = "https://reqres.in";
    protected final static String ENDPOINT_URI = "/api/users";
    protected final static String FINAL_URI = BASE_URI + ENDPOINT_URI;

    protected String name;
    protected String job;

    public RqsClientPost (String name, String job){
        this.name = "name";
        this.job = "job";
    }
    public String getName (){
        return name;
    }
    public String getJob (){
        return job;
    }

    public ValidatableResponse createPost(Object json) {
        return given()
                .header("Content-Type", "application/json")
                .body(json)
                .when().post(FINAL_URI).then();


    }
}