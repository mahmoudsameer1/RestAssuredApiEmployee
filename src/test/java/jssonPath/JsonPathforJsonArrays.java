package jssonPath;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class JsonPathforJsonArrays {

	
	@Test
	public void simpleArra() {
		
		String jsonArray= "[\r\n"
				+ "  \"10\",\r\n"
				+ "  \"20\"\r\n"
				+ "]";
		
		JsonPath jsonPath = new JsonPath(jsonArray);
		System.out.println(jsonPath.getString("[1]"));
		System.out.println(jsonPath.getList("$").size());
	}
	
	@Test
	public void compArray() {
		
		String jsonArray= "[\r\n"
				+ "  [\r\n"
				+ "    \"10\",\r\n"
				+ "    \"20\"\r\n"
				+ "  ],\r\n"
				+ "  [\r\n"
				+ "    \"30\",\r\n"
				+ "    \"40\"\r\n"
				+ "  ]\r\n"
				+ "]";
		
		JsonPath jsonPath = new JsonPath(jsonArray);
		System.out.println(jsonPath.getString("[1][1]"));
		System.out.println(jsonPath.getList("$").size());
	}
	
	@Test
	public void nesterArray() {
		
		String jsonArray = "[\r\n"
				+ "  {\r\n"
				+ "    \"firstName\": \"mahmoud\",\r\n"
				+ "    \"age\": 24,\r\n"
				+ "    \"address\": [\r\n"
				+ "      {\r\n"
				+ "        \"city\": \"amman\"\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"city\" : \"riydh\",\r\n"
				+ "        \"country\": \"Jordan\"\r\n"
				+ "      }\r\n"
				+ "    ]\r\n"
				+ "  },\r\n"
				+ "  {\r\n"
				+ "    \"firstName\": \"sameer\",\r\n"
				+ "    \"age\": 20,\r\n"
				+ "    \"address\": [\r\n"
				+ "      {\r\n"
				+ "        \"city\": \"zarqa\"\r\n"
				+ "      },\r\n"
				+ "      {\r\n"
				+ "        \"country\": \"Jordan\"\r\n"
				+ "      }\r\n"
				+ "    ]\r\n"
				+ "  }\r\n"
				+ "]";
		
		
		JsonPath jsonPath = new JsonPath(jsonArray);	
		System.out.println(jsonPath.getString("[0].address[0].city"));
		System.out.println(jsonPath.getList("[0].adderss.city"));
		
		
		
	}
	
	
}
