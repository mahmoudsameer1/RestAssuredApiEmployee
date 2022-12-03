package newclass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DefaultValues2 {

	@Test
	public void createBooking1() {
		
		RestAssured
		 .given()
		   .log()
		   .all()
		   .basePath("auth")
		   .body("")
		   .contentType("application/json")
		// hit request and get the response
		 .when()
		   .post()
		//validate response
		.then()
		   .log()
		   .all()
		   .statusCode(200);
	}
	@Test
	public void createBooking2() {
		
		RestAssured
		 .given()
		   .log()
		   .all()
		   .body("")
		   .contentType("application/json")
		// hit request and get the response
		 .when()
		   .post()
		//validate response
		.then()
		   .log()
		   .all()
		   .statusCode(200);
	}
}
