package backend;

import app.model.Book;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class Case1 {
    @Test
    public void Case1(){

     given()
                .get("http://localhost:8080/api/books/?id=1")
                .then().assertThat().statusCode(200).body("id".toString(),contains(1))
                .and().body("author",contains("author1"))
                .and().body("title",contains("title"));

    }
    @Test
    public void Case2(){

        given()
                .get("http://localhost:8080/api/books/?id=2")
                .then().assertThat().statusCode(200).body("id".toString(),contains(2))
                .and().body("author",contains("author2"))
                .and().body("title",contains("title2"));

    }

    @Test
    public void Case3(){

        given()
                .get("http://localhost:8080/api/books/")
                .then().assertThat().statusCode(200).body("id".toString(),contains(1,2))
                .and().body("author",contains( "author1","author2"))
                .and().body("title",contains("title","title2"));

    }

    @Test
    public void Case4(){

        given()
                .get("http://localhost:8080/api/books/?id=3")
                .then().assertThat().statusCode(404);

    }
}
