package com.qa.Pages;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.TestBase.TestBase;


public class HomePage extends TestBase{

	public HomePage() throws IOException {
		PageFactory.initElements(driver,this);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath= "//a[@id='btn_basic_example']")
	WebElement StartProcessing;
	
	public MainPage ClickStartProcessing() throws IOException {
		System.out.println("entered");
		boolean flag = StartProcessing.isEnabled();
		System.out.println(flag);
		StartProcessing.click();
		System.out.println("clicked");
		return new MainPage();
	}
	
	

}
