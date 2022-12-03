package JsonObjectPayload;

import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class HandlingDynamicJsonResponse {

	public static void main(String[] args) {
		
		Response response = 
				RestAssured.get("https://run.mocky.io/v3/bc1def8c-de19-4599-9b2b-5ef49a79804c");
		
		Map responseAsMap = response.as(Map.class);
		System.out.println(responseAsMap);
	}
}
