package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificMethods;

public class EditLeadPage extends ProjectSpecificMethods {
	
	public EditLeadPage(ChromeDriver driver)
	{
		this.driver=driver;
	} 
	
	public EditLeadPage updateCompanyname(String UpdateCompanyName) throws InterruptedException
	{
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(UpdateCompanyName);
		Thread.sleep(2000);
		return this;
	}

	public EditLeadPage clickUpdateButton()
	{
		driver.findElement(By.name("submitButton")).click();
		return new EditLeadPage(driver);
	}
	

}
