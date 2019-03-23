package com.qa.Tests;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


import com.qa.Pages.HomePage;

import com.qa.Pages.MainPage;
import com.qa.TestBase.TestBase;
import com.qa.TestUtils.TestUtils;

import Listeners.CustomListeners;

@Listeners(CustomListeners.class)
public class HomePageTest extends TestBase{
HomePage hp;
TestUtils tu ;
MainPage mp;
	public HomePageTest() throws IOException {
		super();
		
	}
	
	@BeforeMethod
	public void setUp() throws IOException {
		initialization();
		hp = new HomePage();
		tu = new TestUtils();
		mp = new MainPage();		
		
	}
	
	@Test
	public  void Test1() throws IOException {
		tu.Scroll();
		hp.ClickStartProcessing();
	}
	
	@Test(priority=2)
	public void Test2() {
		Assert.assertEquals(true, false);
	}
	
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}
	
	
	

}
