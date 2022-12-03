package JsonObjectPayload;

import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class HandlingDynamicResponseUsingInstanceOf {

	public static void main(String[] args) {
		
		Response response = 
		RestAssured.get("https://run.mocky.io/v3/bc1def8c-de19-4599-9b2b-5ef49a79804c");
		
		Object responseAsObject = response.as(Object.class);
		
		if(responseAsObject instanceof List) {
			List responseAsList = (List) responseAsObject;
			System.out.println(responseAsList.size());
			
		}else if (responseAsObject instanceof Map) {
			Map responseAsMap = (Map) responseAsObject;
			System.out.println(((Map) responseAsObject).keySet());
		}
	}
}
