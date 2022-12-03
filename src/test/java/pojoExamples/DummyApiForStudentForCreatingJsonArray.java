package pojoExamples;

import java.util.ArrayList;
import java.util.List;

import io.restassured.RestAssured;

public class DummyApiForStudentForCreatingJsonArray {

	public static void main(String[] args) {
		
		Student s1 = new Student();
		s1.setId(1);
		s1.setFirstName("mahmoud");
		s1.setEmial("test@test.com");
		s1.setBalance(2.1);
		s1.setGender("male");
		
		Student s2 = new Student();
		s1.setId(2);
		s1.setFirstName("sameer");
		s1.setEmial("test@test.com");
		s1.setBalance(2.1);
		s1.setGender("male");
		
		List<Student> jsonArrayStudent = new ArrayList<>();
		jsonArrayStudent.add(s1);
		jsonArrayStudent.add(s2);
		
		RestAssured
		 .given()
		 .log()
		 .all()
		 .body(jsonArrayStudent)
		 .when()
		 .get();
	}
}
