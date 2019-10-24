package tests;

import client.RqsClientPost;
import io.restassured.response.ValidatableResponse;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestPostRqs {
    protected RqsClientPost rqsClientPost;

    @BeforeClass
    public void setUp() {
        this.rqsClientPost = new RqsClientPost("name", "job");
    }

    @Test(dataProvider = "PostData")
    public void testCreatePost(String name, String job) {
        RqsClientPost rqs = new RqsClientPost(name, job);
        ValidatableResponse response = this.rqsClientPost.createPost(rqs);
        response.statusCode(201);

        String expectedName = rqs.getName();
        String expectedJob = rqs.getJob();

        String actualName = response.extract().body().path("name");
        String actualJob = response.extract().body().path("job");

        Assert.assertEquals(expectedName, actualName);
        Assert.assertEquals(expectedJob, actualJob);
    }

        @DataProvider (name = "PostData")
        public Object[][] getPostsData () {
        return new Object [] []{
                {"sonia", "dancer"},
                {"sonia", "leader"},
                {"morpheus", "leader"}
        };
        }
    }

