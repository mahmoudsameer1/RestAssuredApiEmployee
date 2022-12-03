package newclass;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.config.HeaderConfig;
import io.restassured.config.RestAssuredConfig;

public class defaultHeaderBehave {

	
	@Test
	public void defaultBehave() {
		
		RestAssured
		  .given()
		    .header("header1","value1")
		    .header("header1","value2")
		    .log()
		    .all()
		  .when()
		    .get();
	}
	
	@Test
	public void overwriteHeaderValue() {
		
		RestAssured
		  .given()
				.config(RestAssuredConfig.config()
						.headerConfig(HeaderConfig.headerConfig()
								.overwriteHeadersWithName("header1")))
				.header("header1","value1")
				.header("header1","value2")
				.log()
				.all()
			.when()
			    .get();
	}
}
