package jsonschema;

import java.io.File;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.module.jsv.JsonSchemaValidator;

public class JsonSChema {

	public void jsonSchemaValidator() {
		
		RestAssured
		 .given()
		    .log()
		    .all()
		    .baseUri("")
		    .basePath("booking")
		    .body("")
		    .contentType(ContentType.JSON)
		    
		 .when()
		    .post()
		    
		 .then()
		    .log()
		    .all()
		    .statusCode(200)
		    .body(JsonSchemaValidator.matchesJsonSchema(new File("")));
		
	}
}
