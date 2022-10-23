package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import com.testleaf.base.ProjectSpecificMethods;

public class FindLeadsPage extends ProjectSpecificMethods {
	
	public FindLeadsPage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	public FindLeadsPage clickPhoneTab()
	{
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		return this;
	}
	
	public FindLeadsPage enterPhoneNumber(String PhoneNumber)
	{
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(PhoneNumber);
		return this;
	}
	
	public FindLeadsPage clickFindLeadsButton() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(4000);
		return this;

	}
	
	public ViewLeadPage clickFirstResultLeadIDDeleteLead() throws InterruptedException
	{
		Thread.sleep(4000);
		LeadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println("LeadID get from method :"+LeadID);
		
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		Thread.sleep(4000);
		return new ViewLeadPage(driver);
	}
	
//	public ViewLeadPage clickFirstResultLeadID(String leadID) throws InterruptedException
//	{
//		Thread.sleep(4000);
//		LeadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
//	
//		System.out.println("LeadID get from method :"+LeadID);
//		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
//		Thread.sleep(4000);
//		return new ViewLeadPage(driver);
//	}
	
	public ViewLeadPage clickFirstResult() throws InterruptedException
	{
		Thread.sleep(4000);
		String firstResult = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		System.out.println("LeadID get from method :"+firstResult);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		Thread.sleep(4000);
		return new ViewLeadPage(driver);
	}
	
	
	public FindLeadsPage enterLeadID() throws InterruptedException
	{
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(LeadID);
		System.out.println("Lead ID passing from another method"+LeadID);
		Thread.sleep(3000);
		return this;

	}
	
	public void verifyDeleteLead() throws InterruptedException
	{
		Thread.sleep(9000);
		String text = driver.findElement(By.className("x-paging-info")).getText();
		
		if (text.equals("No records to display")) {
			System.out.println("Text matched");
		} else {
			System.out.println("Text not matched");
		}
	}
	
	public FindLeadsPage enterLeadIDMergedEarlier() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(lead);
		Thread.sleep(4000);
		return this;
		
	}

}
