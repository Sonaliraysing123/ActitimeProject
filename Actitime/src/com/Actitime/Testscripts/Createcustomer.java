package com.Actitime.Testscripts;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.Actitime.GenricLibrary.Baseclass;
import com.Actitime.GenricLibrary.FileLibrary;
import com.Actitime.GenricLibrary.Listener_Implementation;
import com.Actitime.ObjectRepository.HomePage;
import com.Actitime.ObjectRepository.TaskPage;
@Listeners(Listener_Implementation.class)
public class Createcustomer extends Baseclass {
	@Test
	public void createcustomer() throws EncryptedDocumentException, IOException
	{
		HomePage hp=new HomePage(driver);
		hp.getTask().click();
	
		TaskPage tp=new TaskPage(driver);
		tp.getAddnewbtn().click();
		tp.getNewcust().click();
		FileLibrary f=new FileLibrary();
		String name = f.readDataFromExcel("Sheet1", 1, 1);
		tp.getCustname().sendKeys(name);
		String desc = f.readDataFromExcel("Sheet1", 1, 2);
		tp.getCustdesc().sendKeys(desc);
		tp.getCreatecust().click();
		
		
	}
	

}
