package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificMethods;

public class CreateLeadPage extends ProjectSpecificMethods {
	
	
	public CreateLeadPage(ChromeDriver driver)
	{
		this.driver=driver;
	}
		
	public CreateLeadPage enterCompanyName(String CompanyName)
	{
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(CompanyName);
		return this;
		
	}
	
	public CreateLeadPage enterFirstName(String FirstName)
	{
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(FirstName);
		return this;
		
	}
	
	public CreateLeadPage enterLastName(String LastName)
	{
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(LastName);
		return this;
		
	}
	
	public ViewLeadPage clickLeadButton() 
	{
			driver.findElement(By.name("submitButton")).click();
			return new ViewLeadPage(driver);
	}

	
	
	
	


}
