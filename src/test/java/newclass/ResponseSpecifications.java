package newclass;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.ResponseSpecification;

public class ResponseSpecifications {

	ResponseSpecification resSpec ;
	@BeforeClass
	public void setUpexpectations() {
		
		resSpec = RestAssured.expect();
		resSpec.statusCode(200)
		       .contentType(ContentType.JSON)
		       .time(Matchers.lessThan(5000L));
	}
	@Test
	public void createBooking1() {
		

		
		//biuld request 
		RestAssured
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
		   .spec(resSpec);
	}
	
	@Test
	public void createBooking2() {
				
		//biuld request 
		RestAssured
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
		   .spec(resSpec);
	}
}
