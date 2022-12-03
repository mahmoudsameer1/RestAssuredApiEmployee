package pojoExamples;

import io.restassured.RestAssured;

public class DummyApiForStudentForCreatingJsonBject {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setId(1);
		s1.setFirstName("mahmoud");
		s1.setEmial("test@test.com");
		s1.setBalance(2.1);
		s1.setGender("male");
		
		RestAssured
		 .given()
		 .log()
		 .all()
		 .body(s1)
		 .when()
		 .get();
	}
}
