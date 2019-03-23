package com.qa.TestUtils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.qa.TestBase.TestBase;

public class TestUtils extends TestBase {
	
	public TestUtils() throws IOException {
		super();
		// TODO Auto-generated constructor stub
	}

	public void Scroll() {
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,2000)");
		System.out.println("scrolled");
		
		
	}
	

}
