package JsonObjectPayload;

import java.util.Map;

import io.restassured.RestAssured;

public class ConvertNestedJsonObjectResponseToJavaMap2 {

	public static void main(String[] args) {

		Map jsonResponseAsMap = RestAssured.get("https://run.mocky.io/v3/04d3f682-ef89-4580-8497-0754cc36974c")
				.as(Map.class);
		
		String firstName = (String) jsonResponseAsMap.get("firstName");
		System.out.println(firstName);
		
		Map<String,String> skillsMap = (Map<String,String>)jsonResponseAsMap.get("skills");
		System.out.println(skillsMap.get("name"));
		System.out.println(skillsMap.get("prof"));
		
	}
}
