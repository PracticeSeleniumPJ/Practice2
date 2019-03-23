package com.qa.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;



public class MainPage extends TestBase{

	public MainPage() throws IOException {
		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}

	@FindBy(linkText="Simple Form Demo")
	WebElement SimpleFormDemoButton;
	
}
