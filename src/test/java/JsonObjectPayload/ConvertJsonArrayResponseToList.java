package JsonObjectPayload;

import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;

public class ConvertJsonArrayResponseToList {

	public static void main(String[] args) {
		
		List<Object> allEmp = RestAssured
		.get("https://run.mocky.io/v3/15a0d00e-83d1-4b5e-9998-783c39b96501")
		.as(List.class);
		
		System.out.println(allEmp.size());
		
		Map<String, Object>emp1 = (Map<String, Object>) allEmp.get(0);
		System.out.println(emp1.get("firstName"));
		
		
	}
}
