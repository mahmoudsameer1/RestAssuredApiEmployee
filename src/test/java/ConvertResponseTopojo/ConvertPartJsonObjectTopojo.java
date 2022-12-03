package ConvertResponseTopojo;

import io.restassured.RestAssured;

public class ConvertPartJsonObjectTopojo {

	public static void main(String[] args) {
		
		Address address = RestAssured
				.get("https://run.mocky.io/v3/917b29e5-3323-4620-831e-5035278c90ac")
				.jsonPath()
				.getObject("address", Address.class);
		
		System.out.println(address.getCity());
	}
}
