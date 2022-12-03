package newclass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class DefaultValues1 {

	@BeforeTest
	public void setUp() {
		
		RestAssured.baseURI = "https://restful-booker.herokuapp.com/";
		RestAssured.basePath = "booking";
		RestAssured.requestSpecification = null;
		RestAssured.responseSpecification = null;
		
	}
	@Test
	public void createBooking1() {
		
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
