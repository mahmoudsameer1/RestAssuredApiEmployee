package DataShare;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ShareDataAmountMethod {

	private int bookingId;
	
	@Test
	public void createBooking() {
		
		DataStore.BOOKING_ID = RestAssured
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
		   .statusCode(200)
		   .extract()
		   .jsonPath()
		   .getInt("bookingId");
				
	}
	@Test
	public void retrieveBooking() {
		
		Response response = RestAssured
				.given()
				.log()
				.all()
				.get("https://restful-booker.herokuapp.com/booking/"+DataStore.BOOKING_ID)
				.then()
				.log()
				.all()
				.extract()
				.response();
	}
	}

