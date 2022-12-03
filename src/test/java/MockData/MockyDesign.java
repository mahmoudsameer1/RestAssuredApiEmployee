package MockData;

import io.restassured.RestAssured;

public class MockyDesign {

	public static void main(String[] args) {
		
		RestAssured
		  .given()
		  .log()
		  .all()
		  .get("https://run.mocky.io/v3/71f7839f-413d-40c3-b427-c113b84b7f40")
		  .then()
		  .log()
		  .all();
		
	}
}
