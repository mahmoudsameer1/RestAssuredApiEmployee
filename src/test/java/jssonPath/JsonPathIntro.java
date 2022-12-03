package jssonPath;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class JsonPathIntro {

	@Test
	public void jsonPathDemo() {
		
		String json= "{\r\n"
				+ "\"firstname\": \"jim\" \r\n"+ 
				"}";
		
		// get JSON path instance of given json doc
		
		JsonPath jsonPath = new JsonPath(json);
		String firstName = jsonPath.getString("firstname");
		
		System.out.println(firstName);
		
		Object fname = jsonPath.get("firstname");
		System.out.println(fname);
		
		int i = jsonPath.get("firstname");
		System.out.println(i);
		
	}
	
}
