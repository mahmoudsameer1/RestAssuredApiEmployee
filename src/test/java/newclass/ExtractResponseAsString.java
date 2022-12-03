package newclass;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class ExtractResponseAsString {

	@Test
	public void main() {
		
		//biuld request 
		String responseBody = RestAssured
		 .given()
		   .log()
		   .all()
		   .baseUri("https://restful-booker.herokuapp.com/")
		   .basePath("booking")
		   .body("")
		   .contentType(ContentType.JSON)
		// hit request and get the response
		 .when()
		   .post()
		//validate response
		.then()
		   .log()
		   .all()
		   .extract()
		   .body()
		   .asPrettyString();
		
		System.out.println(responseBody);
	}
}
