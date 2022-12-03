package JsonObjectPayload;

import java.util.LinkedHashMap;
import java.util.Map;

import io.restassured.RestAssured;

public class CreateNestedJsonObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Object> payload = new LinkedHashMap<>();
		payload.put("id", 1);
		payload.put("firstName", "mahmoud");
		payload.put("age", 24);
		payload.put("mariied", false);
		payload.put("slary", 213.4);
		
		Map<String, Object> addressMap = new LinkedHashMap<>();
		
		addressMap.putIfAbsent("no", "#81");
		addressMap.putIfAbsent("streetName", "404 not found");
		addressMap.putIfAbsent("city", "amman");
		addressMap.putIfAbsent("stat", "jordan");
		
		payload.put("address", addressMap);
		
		RestAssured
		 .given()
		   .log()
		   .all()
		   .body(payload)
		   .get();
	}

}
