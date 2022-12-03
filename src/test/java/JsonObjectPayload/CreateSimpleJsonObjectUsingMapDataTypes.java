package JsonObjectPayload;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import io.restassured.RestAssured;

public class CreateSimpleJsonObjectUsingMapDataTypes {

	
	public static void main(String[] args) {
		
		// to get the json in right formate use linkedHashMap
		Map<String, Object> jsonObjectPayload = new LinkedHashMap<>();
		jsonObjectPayload.put("id", 1);
		jsonObjectPayload.put("firstName", "mahmoud");
		jsonObjectPayload.put("age", 24);
		jsonObjectPayload.put("mariied", false);
		jsonObjectPayload.put("slary", 213.4);
		
		RestAssured
		 .given()
		    .log()
		    .all()
		    .body(jsonObjectPayload)
		    .get();
		
	}
}
