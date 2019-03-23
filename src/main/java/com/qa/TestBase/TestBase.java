package com.qa.TestBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TestBase {
	public static WebDriver driver;
	public static Properties prop;


	public TestBase() throws IOException {
		prop = new Properties();
		
		FileInputStream fis = new FileInputStream("C:\\Users\\priya\\eclipse-workspace\\Project\\src\\main\\java\\com\\qa\\config\\config.properties");
		prop.load(fis);
		
		}
	
	public static void initialization() {
	String Browser = prop.getProperty("browsername");
	if(Browser.equals("Chrome")) {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Java\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.get(prop.getProperty("url"));
	}
	
	}
	public void Failed(String methodName) throws IOException {
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\priya\\eclipse-workspace\\Project\\src\\test\\java\\Screenshot\\"+methodName+".jpg"));
	}

}
