package ConvertResponseTopojo;

import io.restassured.RestAssured;

public class NestedJsonObjectToPojo {

	public static void main(String[] args) {
		
		EmployeeWithAddress employeeWithAddress = RestAssured
		.given()
		.get("https://run.mocky.io/v3/990d16d7-bb2e-471a-82ca-8d13d5b807a9")
		.as(EmployeeWithAddress.class);
		
		String fn =employeeWithAddress.getFirstName();
		System.out.println(fn);
		
		Address address = employeeWithAddress.getAddress();
		System.out.println(address.getStreetName());
		
	}
}
