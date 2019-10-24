package tests;

import client.RqsClientGet;
import io.restassured.response.ValidatableResponse;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestRqsGet {
    protected RqsClientGet rqsClientGet;

    @BeforeClass
    public void setUp () {
    this.rqsClientGet = new RqsClientGet();
    }

    @Test
    public void validateGetPost (){
        ValidatableResponse response = rqsClientGet.getPost();
        response.statusCode(415);

    }
}
