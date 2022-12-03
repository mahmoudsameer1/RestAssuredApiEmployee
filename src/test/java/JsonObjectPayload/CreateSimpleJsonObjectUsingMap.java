package JsonObjectPayload;

import java.util.HashMap;
import java.util.Map;

import io.restassured.RestAssured;

public class CreateSimpleJsonObjectUsingMap {

	
	public static void main(String[] args) {
		
		Map<String, String> jsonObjectPayload = new HashMap<>();
		jsonObjectPayload.put("id", "1");
		jsonObjectPayload.put("firstName", "mahmoud");
		jsonObjectPayload.put("age", "24");
		jsonObjectPayload.put("mariied", "false");
		jsonObjectPayload.put("slary", "213.4");
		
		RestAssured
		 .given()
		    .log()
		    .all()
		    .body(jsonObjectPayload)
		    .get();
		
	}
}
