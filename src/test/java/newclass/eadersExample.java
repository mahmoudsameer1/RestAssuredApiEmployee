package newclass;

import java.util.HashMap;
import java.util.Map;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Header;

public class eadersExample {

	@Test
	public void passHeader1() {
		
		RestAssured
		 .given()
		   .log()
		   .all()
		   .header("Header1","value1")
		   .header("Header2","value1","value2")
		 .when()
		 .get();
	}
	
	@Test
	public void passHeader2() {
		
		Header headers = new Header("Header1","value1");
		RestAssured
		 .given()
		   .log()
		   .all()
		   .header(headers)
		 .when()
		 .get();
	}
	
	@Test
	public void passHeader3() {
		
		RestAssured
		 .given()
		   .log()
		   .all()
		   .headers("h1","v1","h2","v2")
		 .when()
		 .get();
	}
	
	@Test
	public void passHeader4() {
		
		Map<String, String> head = new HashMap<>();
		head.put("h1", "v1");
		head.put("h2", "v2");
		RestAssured
		 .given()
		   .log()
		   .all()
		   .headers(head)
		 .when()
		 .get();
	}
}
