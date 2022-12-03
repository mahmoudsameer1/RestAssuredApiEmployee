package jsonschema;

import org.hamcrest.MatcherAssert;
import org.testng.annotations.Test;

import io.restassured.module.jsv.JsonSchemaValidator;

public class VerifyJsonAgainstSchema {

	@Test
	public void main() {
		
		String json = "";
		
		MatcherAssert.assertThat(json, JsonSchemaValidator.matchesJsonSchemaInClasspath("filename.json"));
		
		;
	}
}
