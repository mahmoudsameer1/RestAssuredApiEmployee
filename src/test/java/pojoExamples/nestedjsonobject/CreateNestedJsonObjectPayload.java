package pojoExamples.nestedjsonobject;

import io.restassured.RestAssured;

public class CreateNestedJsonObjectPayload {

	public static void main(String[] args) {
		
		Employee employee = new Employee();
		employee.setFirstName("mahmoud");
		employee.setLastName("sameer");
		employee.setProffession("software");
		
		Address address = new Address();
		address.setHouseNo(1);
		address.setStreetName("not found");
		address.setCity("amman");
		address.setCountry("jordan");
		
		employee.setAddress(address);
		
		RestAssured
		 .given()
		 .log()
		 .all()
		 .body(employee);
	}
}
