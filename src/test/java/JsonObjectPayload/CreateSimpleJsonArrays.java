package JsonObjectPayload;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;

public class CreateSimpleJsonArrays {

	public static void main(String[] args) {
		
		Map<String, Object> emDetails = new LinkedHashMap<>();
		emDetails.put("id", "1");
		emDetails.put("firstName", "mahmoud");
		emDetails.put("email", "test@gmail.com");
		emDetails.put("gender", "male");
		
		Map<String, Object> emDetails2 = new LinkedHashMap<>();
		emDetails.put("id", "2");
		emDetails.put("firstName", "sameer");
		emDetails.put("email", "test2@gmail.com");
		emDetails.put("gender", "male");
		
		List<Map<String,Object>> allEmp = new ArrayList<>();
		allEmp.add(emDetails);
		allEmp.add(emDetails2);
		
		RestAssured
		  .given()
		     .log()
		     .all()
		     .body(allEmp)
		     .get();
	}

	
	
}
