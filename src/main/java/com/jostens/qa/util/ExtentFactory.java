package com.jostens.qa.util;

import java.io.File;

import com.relevantcodes.extentreports.ExtentReports;

public class ExtentFactory {
	
	private static String path = System.getProperty("user.dir") + File.separator + "test-output" + File.separator + "ExtentReport.html";
	
	public static ExtentReports getInstance() {
		ExtentReports extent;
//		String path = System.getProperty("user.dir") + "\\test-output\\ExtentReport.html";
		extent = new ExtentReports(path, false);
		
		return extent;
	}
	
	public static void deleteExtentReport() {
		File file = new File(path);
		
		if (file.delete()) {
			System.out.println("File deleted successfully");
		} else {
			System.out.println("Failed to delete file, located at: " + path);
		}
	}
	
}