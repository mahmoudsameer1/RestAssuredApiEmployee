package newclass;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RequestSpecifications {

	RequestSpecification reqSpec;
	
	@BeforeClass 
	public void setupRequest() {
		
		reqSpec = RestAssured.given();
		reqSpec
		 .log()
		 .all()
		 .baseUri("https://restful-booker.herokuapp.com/")
		 
		 .contentType(ContentType.JSON);
	}
	@Test
	public void createBooking() {
		
		RestAssured
		 .given()
		   .spec(reqSpec)
		   .basePath("booking")
		   .body("")
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
	public void updateBooking() {
		
		RestAssured
		 .given()
		   .spec(reqSpec)
		   .header("Authorization", "Basic qewrqwokfsa=")
		   .basePath("booking")
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
