package com.inetbanking.utilities;

import org.openqa.selenium.WebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;

public class mylisteners implements ITestListener {
	
	ExtentReports extentReport;
	ExtentTest extentTest;
	
	@Override
	public void onStart(ITestContext context) {
		
		System.out.println("Execution of Project Tests started");
		
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		
   /*
		extentTest = extentReport.createTest(result.getName());
		extentTest.log(Status.INFO,result.getName()+" started executing");
		
		*/
		
		System.out.println("Test execution started1");
		
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		
		
		/*
		extentTest.log(Status.PASS,result.getName()+" got successfully executed");
		
		*/
		System.out.println("test execution is success1");
		
			}

	@Override
	public void onTestFailure(ITestResult result) {
		
    /*    WebDriver driver = null;
		
		try {
			driver = (WebDriver)result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
		} catch (IllegalArgumentException | IllegalAccessException | NoSuchFieldException | SecurityException e) {
			e.printStackTrace();
		}
		
		String destinationScreenshotPath = Utilities.captureScreenshot(driver,result.getName());
		
		extentTest.addScreenCaptureFromPath(destinationScreenshotPath);
		extentTest.log(Status.INFO,result.getThrowable());
		extentTest.log(Status.FAIL,result.getName()+" got failed");
		
		*/
		
		
		
		System.out.println("Test is failed enjoy");
		
		
		
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		
		
		/*
		extentTest.log(Status.INFO,result.getThrowable());
		extentTest.log(Status.SKIP, result.getName()+" got skipped");
		
		*/
		
	}

	

	@Override
	public void onFinish(ITestContext context) {
		
		  //extentReport.flush();
		
		System.out.println("execution is finished");
		
	}
	
	
	
	

}
