package com.employee.utilities;

import org.testng.ITestContext;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Listeners extends TestListenerAdapter{

	public ExtentHtmlReporter htmlReporter;
	public ExtentReports extent;
	public ExtentTest test;
	
	public void onStart(ITestContext testContext) {
		
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir")+"/test-output/myReport.html");
		htmlReporter.config().setDocumentTitle("Automation Report");
		htmlReporter.config().setReportName("Rest Assured Test");
		htmlReporter.config().setTheme(Theme.DARK);
		
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);
		extent.setSystemInfo("Host name", "local host");
		extent.setSystemInfo("Enviroment", "Staging");
	}
	
	public void onTestSucess(ITestResult result) {
		
		test = extent.createTest(result.getName());
		test.log(Status.PASS, "Test Case PASSED IS"+result.getName());	
	}
	
	public void onTestFailure(ITestResult result) {
		
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "Test Case FAILED IS"+result.getName());
		test.log(Status.FAIL, "Test Case FAILED IS"+result.getThrowable());
	}
	
	public void onTestSkipped(ITestResult result) {
		
		test = extent.createTest(result.getName());
		test.log(Status.FAIL, "Test Case SKIPPED IS"+result.getName());
	}
	
	public void onFinish(ITestResult result) {
		
		extent.flush();
	}
}
