package DataShare;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class TestModuleOne {

	@Test
	public void createBooking() {

		int id = RestAssured.given().log().all().baseUri("https://restful-booker.herokuapp.com/")
				.basePath("booking").body("").contentType(ContentType.JSON)
				// hit request and get the response
				.when().post()
				// validate response
				.then().log().all().statusCode(200).extract().jsonPath().getInt("bookingId");
		DataStoreAsMap.setValue("bookingId", id);

	}

	@Test
	public void retrieveBooking() {

		int id = (int) DataStoreAsMap.gatValue("bookingid");
		Response response = RestAssured.given().log().all()
				.get("https://restful-booker.herokuapp.com/booking/" + id ).then().log().all()
				.extract().response();
	}
}
