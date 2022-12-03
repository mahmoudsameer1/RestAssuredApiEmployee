package jssonPath;

import io.restassured.path.json.JsonPath;

public class JsonPathJsonObject {

	public void jsonPathforsimpleObject() {
		
		String jsonObject = "{\r\n"
				+ "\"firstName\" : \"amod\",\r\n "
				+ " \"age\" : \"24\" ,\r\n"
				+ " \"married\" : false\r\n"
				+ "}";
		
		JsonPath jp = new JsonPath(jsonObject);
		String firstName = jp.get("firstName");
		System.out.println(firstName);
		
		int age = jp.getInt("age");
		System.out.println(age);
		
		boolean married = jp.getBoolean("married");
		System.out.println(married);
		
		
	}
	
	public void jsonPathfornestedObject() {
		
		String jsonObject = "{\r\n"
				+ "\"firstName\" : \"amod\",\r\n "
				+ " \"age\" : 24,\r\n"
				+ " \"address\" : {\r\n"+
				  "     \"flatNo\" : 401,\r\n" +
				  "     \"pin\" : 1233456\r\n" +
				  "     },\r\n"
				+ " \"married\" : false\r\n"
				+ "}";
		
		JsonPath jp = new JsonPath(jsonObject);
		
		String flatnum = jp.get("address.flarNo");
		System.out.println(flatnum);
		
	}

}
