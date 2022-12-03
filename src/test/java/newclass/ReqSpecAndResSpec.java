package newclass;

import org.hamcrest.Matchers;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class ReqSpecAndResSpec {

	RequestSpecification reqSpec;
	ResponseSpecification resSpec ;
	
	@BeforeClass 
	public void setupRequest() {
		
		reqSpec = RestAssured.given();
		reqSpec
		 .log()
		 .all()
		 .baseUri("https://restful-booker.herokuapp.com/")
		 .basePath("booking")
		 .contentType(ContentType.JSON);
		
		resSpec = RestAssured.expect();
		resSpec.statusCode(200)
		       .contentType(ContentType.JSON)
		       .time(Matchers.lessThan(5000L));
	}
	@Test
	public void createBooking() {
		
		RestAssured
		 .given()
		   .spec(reqSpec)
		   .body("")
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
