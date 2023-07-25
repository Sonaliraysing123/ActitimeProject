package com.Actitime.GenricLibrary;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import com.Actitime.ObjectRepository.HomePage;
import com.Actitime.ObjectRepository.LoginPage;

public class Baseclass {
	FileLibrary f=new FileLibrary();
	public WebDriver driver;
	@BeforeSuite
	public void databaseConnection()
	{
		Reporter.log("Data base connected",true);
	}
	@BeforeClass
	public void LanuchBrowser() throws IOException
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String URL = f.readDataFromPropertyFile("url");
		driver.get(URL);
		Reporter.log("Broswer is launch successfully",true);
	}
	@BeforeMethod
	public void login() throws IOException
	{
		String un = f.readDataFromPropertyFile("username");
		System.out.println(un);
		LoginPage lp=new LoginPage(driver);
		lp.getUntbx().sendKeys(un);
		String pw = f.readDataFromPropertyFile("password");
	lp.getPwtbx().sendKeys(pw);
	lp.getLogin().click();
		Reporter.log("Login Successfully",true);
	}
	@AfterMethod
	public void logout()
	{
		HomePage hp=new HomePage(driver);
		hp.getLogout().click();
		Reporter.log("Logout successfully",true);
	}
	@AfterClass
	public void closeTheBrowser() {
		driver.close();
		Reporter.log("Browser closed successfully",true);
	}
	@BeforeSuite
	public void disconnectdatabase() {
		Reporter.log("database disconnected successfully",true);
		
	}

	

}
