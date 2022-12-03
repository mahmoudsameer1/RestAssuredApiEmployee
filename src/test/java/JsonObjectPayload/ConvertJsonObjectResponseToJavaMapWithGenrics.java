package JsonObjectPayload;

import java.util.Map;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

public class ConvertJsonObjectResponseToJavaMapWithGenrics {

	public static void main(String[] args) {

		Map<String,Object> jsonResponseAsMap = RestAssured.get("https://run.mocky.io/v3/71f7839f-413d-40c3-b427-c113b84b7f40")
				.as(new TypeRef<Map<String,Object>>(){});
		
		String firstName = (String) jsonResponseAsMap.get("firstName");
		System.out.println(firstName);
		
		jsonResponseAsMap.keySet().forEach(k -> System.out.println(k));
		
	}
}
