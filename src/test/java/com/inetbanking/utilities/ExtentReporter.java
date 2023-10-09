package com.inetbanking.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReporter {
	
	public static ExtentReports generateExtentReport() {
		
		ExtentReports extentReport=new ExtentReports();
		
		File extentreportfile=new File(System.getProperty("user.dir")+"\\target\\ExtentRports\\extentreport.html");
		
		
		ExtentSparkReporter sparkreporter=new ExtentSparkReporter(extentreportfile);
		
		sparkreporter.config().setTheme(Theme.STANDARD);
		sparkreporter.config().setReportName("Automation Test Report");
		sparkreporter.config().setDocumentTitle("Test Report");
		
		sparkreporter.config().setTimeStampFormat("dd/MM/yyyy hh:mm:ss");
		
		extentReport.attachReporter(sparkreporter);
		
		
		Properties configprop=new Properties();
		
		File configpropfile=new File(System.getProperty("user.dir")+"\\configuration\\config.properties");
		
		try {
			
			FileInputStream fisconfigprop=new FileInputStream(configpropfile);
			configprop.load(fisconfigprop);
			
		}  catch (Throwable e) {
			
			e.printStackTrace();
			
		}
		
		
		extentReport.setSystemInfo("Application URL",configprop.getProperty("url"));
		extentReport.setSystemInfo("Browser Name",configprop.getProperty("browserName"));
		
		
		
		
		
		
		
		
		
		
		
		
		return extentReport;
		
		
		
		
		
		
		
	}
	
	

}
