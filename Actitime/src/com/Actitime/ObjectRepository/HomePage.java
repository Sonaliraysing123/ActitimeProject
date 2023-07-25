package com.Actitime.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	@FindBy(xpath = "//div[.='Time-Track']")
	private WebElement timetrack;
	
	@FindBy(xpath = "//div[.='Tasks']")
	private WebElement task;
	
	@FindBy (xpath = "//div[.='Reports']")
	private WebElement report;
	
	@FindBy (xpath = "//div[.='Users']")
	private WebElement users;
	
	@FindBy(id = "logoutLink")
	private WebElement logout;
	
	//initilazation
		public HomePage(WebDriver driver) {
			PageFactory.initElements(driver, this);
		}
		
		//utilization


		public WebElement getTimetrack() {
			return timetrack;
		}

		public WebElement getTask() {
			return task;
		}

		public WebElement getReport() {
			return report;
		}

		public WebElement getUsers() {
			return users;
		}

		public WebElement getLogout() {
			return logout;
		}
		
		

}
