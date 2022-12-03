package jssonPath;

import java.io.File;
import java.util.List;

import org.testng.annotations.Test;

import io.restassured.path.json.JsonPath;

public class JsonPathWithFilters {

	@Test
	public void filters() {
		
		String filePath = System.getProperty("user.dir")+"src\\test\\java\\jssonPath\\people.json";
		File jsonArrayFile = new File(filePath);
		
		JsonPath jsonPath = new JsonPath(jsonArrayFile);
		
		System.out.println(jsonPath.getString("[0].firstName"));
		List<Object> allFirstNames = jsonPath.getList("firstName");
		System.out.println(allFirstNames);
		
		// to filter and get the name of femals 
		List<String> allFemaleNames = jsonPath.getList("findAll{it.gender == 'female'}.firstName");
		System.out.println(allFemaleNames);
		
		String address = jsonPath.getString("find{it.firstName== 'mmahmoud' & it.age==24}.address");
		System.out.println(address);
		
		
	}
}
