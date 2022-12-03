package ConvertResponseTopojo;

import io.restassured.RestAssured;


public class JsonResponseToPojo {

	public static void main(String[] args) {
		
		Employee employee =RestAssured
		 .get("https://run.mocky.io/v3/917b29e5-3323-4620-831e-5035278c90ac")
		 .as(Employee.class);
		
		int age = employee.getAge();
		System.out.println(age);
	}
}
