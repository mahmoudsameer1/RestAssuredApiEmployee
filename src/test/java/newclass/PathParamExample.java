package newclass;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class PathParamExample {

	@Test
	public void main() {
		
		/*Map<String,Object> pathParameter = new HashMap<>();
		pathParameter.put("basePath", "booking");
		pathParameter.put("bookigId", 2);*/
		
		
		//biuld request 
		RestAssured
		 .given()
		   .log()
		   .all()
		   .baseUri("https://restful-booker.herokuapp.com/")
		   .basePath("{basePath}/{bookigId}")
		   .pathParam("basePath", "booking")
		   .pathParam("bookigId", 2)
		   //.pathParam(pathParameter)
		// hit request and get the response
		 .when()
		 // .get("https://restful-booker.herokuapp.com/{basePath}/{bookigId}","booking",2) 
		   .get()
		//validate response
		.then()
		   .log()
		   .all()
		   .statusCode(200);
	}
}
