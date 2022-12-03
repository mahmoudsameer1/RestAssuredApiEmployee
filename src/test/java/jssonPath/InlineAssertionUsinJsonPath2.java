package jssonPath;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;


public class InlineAssertionUsinJsonPath2 {

	@Test
	public void main() {
		
		
        RestAssured
		 .given()
		    .baseUri("https://restful-booker.herokuapp.com/booking")
		 .when()
		    .get()
		    
		 .then()
		    .log()
		    .all()
		    .body("bookingid", Matchers.hasItems(9,10));
		
	}
}
