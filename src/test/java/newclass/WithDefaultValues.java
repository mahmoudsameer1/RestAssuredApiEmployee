package newclass;

import org.testng.annotations.Test;
import io.restassured.RestAssured;

public class WithDefaultValues {

	@Test
	public void main() {
		
		//biuld request 
		RestAssured
		 .given()
		   .log()
		   .all()
		   //.baseUri("https://restful-booker.herokuapp.com/")
		  // .basePath("booking")
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
