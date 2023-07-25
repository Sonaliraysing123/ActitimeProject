package com.Actitime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	//declration
	@FindBy(id="username")
	private WebElement untbx;
	
	@FindBy(name="pwd")
	private WebElement pwtbx;
	
	@FindBy(xpath="//div[.='Login ']")
	private WebElement login;
	
	//initilazation
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization

	public WebElement getUntbx() {
		return untbx;
	}

	public WebElement getPwtbx() {
		return pwtbx;
	}

	public WebElement getLogin() {
		return login;
	}
	

}
