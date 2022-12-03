package newclass;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetBooking {

	@Test
	public void main() {
		
		//biuld request 
		RestAssured
		 .given()
		   .log()
		   .all()
		   .baseUri("https://restful-booker.herokuapp.com/")
		   .basePath("booking/{id}")
		   .pathParam("id", 1)
		// hit request and get the response
		 .when()
		   .get()
		//validate response
		.then()
		   .statusCode(200);
	}
}
