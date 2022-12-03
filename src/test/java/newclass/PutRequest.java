package newclass;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PutRequest {

	@Test
	public void main() {
		
		//biuld request 
		RestAssured
		 .given()
		   .log()
		   .all()
		   .baseUri("https://restful-booker.herokuapp.com/")
		   .basePath("booking/1")
		   .header("Content-Type","application/json")
		   .header("Authorization", "Basic qewrqwokfsa=")
		   .body("")
		// hit request and get the response
		 .when()
		   .put()
		//validate response
		.then()
		   .log()
		   .all()
		   .statusCode(200);
	}
}
