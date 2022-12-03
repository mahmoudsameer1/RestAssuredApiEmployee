package JsonObjectPayload;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import io.restassured.RestAssured;

public class CreateComplexPayLoadUsingMapList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// parent Json Array --follow the photos
		List<Map<String, Object>> finalpayload = new ArrayList<>();
		
		Map<String, Object> firstJsonObject = new LinkedHashMap<>();
		firstJsonObject.put("id", 1);
		firstJsonObject.put("firstName", "mahmoud");
		firstJsonObject.put("email", "test@gmail.com");
		firstJsonObject.put("gender", "male");
		
		List<String> mobileNo = new ArrayList<String>();
		mobileNo.add("123");
		mobileNo.add("456");
		
		firstJsonObject.put("mobile", mobileNo);
		
		Map<String, Object> skillSet1 = new LinkedHashMap<String, Object>();
		skillSet1.put("name", "test");
		skillSet1.put("prof", "medium");
		
		firstJsonObject.put("skills", skillSet1);
		
		
		Map<String, Object> secondJsonObject = new LinkedHashMap<>();
		firstJsonObject.put("id", 2);
		firstJsonObject.put("firstName", "sameer");
		firstJsonObject.put("email", "test2@gmail.com");
		firstJsonObject.put("gender", "male");
		
		List<Map<String,Object>> skillsList = new LinkedList<>();
		skillsList.add(skillSet1);
		
		Map<String, Object> javaSkill = new LinkedHashMap<String, Object>();
		javaSkill.put("name", "java");
		javaSkill.put("prof", "medium");
		
		List<String> certification = new ArrayList<String>();
		mobileNo.add("ISTQB");
		mobileNo.add("ISTQB1");
		
		javaSkill.put("certifications", certification);
		
		skillsList.add(javaSkill);
		
		secondJsonObject.put("skills", skillsList);
		
		finalpayload.add(firstJsonObject);
		finalpayload.add(secondJsonObject);
		
		RestAssured
		  .given()
		  .log()
		  .all()
		  .body(finalpayload)
		  .get();
	}

}
