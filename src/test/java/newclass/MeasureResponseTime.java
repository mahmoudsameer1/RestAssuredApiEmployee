package newclass;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.response.ValidatableResponse;

public class MeasureResponseTime {

	@Test
	public void main() {
		
		//biuld request 
		Response response =RestAssured
		 .given()
		   .log()
		   .all()
		   .baseUri("https://restful-booker.herokuapp.com/")
		   .basePath("booking")
		   .body("")
		   .contentType(ContentType.JSON)
		// hit request and get the response
		 .when()
		   .post();
		//validate response
		
		long responseTime =(response.time());
		System.out.println("responseTime in MS"+responseTime);
		
		long resTime = response.timeIn(TimeUnit.SECONDS);
		System.out.println("responseTime in s"+resTime);
		
		response.then().time(Matchers.lessThan(5000L));
	}
}
