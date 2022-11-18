package com.employee.testCases;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.employee.base.TestBase;

import io.restassured.RestAssured;
import io.restassured.http.Method;

public class TC001_Get_All_Employee extends TestBase {

	@BeforeClass
	void getAllEmployees() throws InterruptedException {

		logger.info("*** Strat TC001_Get_All_Employee **** ");

		RestAssured.baseURI = "https://dummy.restapiexample.com/api/v1";
		httpRequest = RestAssured.given();
		response = httpRequest.request(Method.GET, "/employees");

		Thread.sleep(3000);
	}

	@Test
	void checkResponseBody() {

		logger.info("**** Checking Response Body ****");

		String responseBody = response.getBody().asString();
		logger.info("Response Body==>" + responseBody);
		Assert.assertTrue(responseBody != null);
	}

	@Test
	void checkStatusCode() {

		logger.info("**** Checking Status Code ****");

		int statusCode = response.getStatusCode();
		logger.info("Response Code==>" + statusCode);

		if (statusCode > 200) {
			logger.warn("Status code is greater than 200");
			Assert.assertTrue(statusCode > 200);
		} else if (statusCode < 200) {
			logger.warn("Status code is less than 200");
			Assert.assertTrue(statusCode < 200);
		} else if (statusCode == 200) {
			logger.warn("Status code is equals than 200");
			Assert.assertEquals(statusCode, 200);
		}
	}

	@Test
	void checkResponseTime() {

		logger.info("**** Checking Response Time ****");

		long responseTime = response.getTime();
		logger.info("Response Time==>" + responseTime);

		if (responseTime > 200) {
			logger.warn("Response Time is greater than 200");
			Assert.assertTrue(responseTime > 200);
		} else if (responseTime < 200) {
			logger.warn("Response Time is less than 200");
			Assert.assertTrue(responseTime < 200);
		} else if (responseTime == 200) {
			logger.warn("Response Time is equals than 200");
			Assert.assertEquals(responseTime, 200);
		}
	}

	@Test
	void checkStatusLine() {

		logger.info("**** Checking Status Line ****");

		String statusLine = response.getStatusLine();
		logger.info("Response Line==>" + statusLine);
		Assert.assertEquals(statusLine, "HTTP/1.1 200 OK");
	}

	@Test
	void checkContentType() {

		logger.info("**** Checking Content Type ****");

		String contentType = response.header("Content-Type");
		logger.info("Content Type==>" + contentType);
		Assert.assertEquals(contentType, "text/html; charset=UTF-8");
	}

	@Test
	void checkServerType() {

		logger.info("**** Checking Server Type ****");

		String serverType = response.header("Server");
		logger.info("Server Type==>" + serverType);
		Assert.assertEquals(serverType, "nginx/1.21.6");
	}

	@Test
	void checkContentEncoding() {

		logger.info("**** Checking Content Encoding ****");

		String contentEncoding = response.header("Content-Encoding");
		logger.info("Content Encoding==>" + contentEncoding);
		Assert.assertEquals(contentEncoding, "gzip");
	}

	@Test
	void checkContentLengh() {

		logger.info("**** Checking Content Lenght ****");

		String ContentLength = response.header("Content-Length");
		logger.info("Content Length==>" + ContentLength);

		if (Integer.parseInt(ContentLength) < 100)
			logger.warn("Content Length is less than 100");

		Assert.assertTrue(Integer.parseInt(ContentLength) > 100);
	}

	@Test
	void checkCookies() {

		logger.info("**** Checking Cookies ****");

		String cookie = response.getCookie("PHPSESSID");
	}

	@AfterClass
	void tearDown() {

		logger.info("**** Finished TC001_Get_All_Employee ****");
	}
}
