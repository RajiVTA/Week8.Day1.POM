package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificMethods;

public class LeadsPage extends ProjectSpecificMethods {
	
	public LeadsPage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	public CreateLeadPage clickCreateLead()
	{
		driver.findElement(By.linkText("Create Lead")).click();
		return new CreateLeadPage(driver);
		
	}
	
	public FindLeadsPage clickFindLeads()
	{
		driver.findElement(By.linkText("Find Leads")).click();
		return new FindLeadsPage(driver);
		
	}
	
	public MergeLeadsPage clickMergeLeadsLink()
	{
		driver.findElement(By.linkText("Merge Leads")).click();
		return new MergeLeadsPage(driver);
		
	}
	
	

}
