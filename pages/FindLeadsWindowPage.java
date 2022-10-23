package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificMethods;

public class FindLeadsWindowPage extends ProjectSpecificMethods {

	public FindLeadsWindowPage(ChromeDriver driver) 
	{
		this.driver=driver;
	}

	public FindLeadsWindowPage enterFirstNameWindow() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("Anu");
		Thread.sleep(4000);
		return this;
	}
	
	public FindLeadsWindowPage clickFindLeadsButtonWindow() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(4000);
		return this;
	}
	
	public MergeLeadsPage clickFirstResultLeadIDFromLeadWindow()
	{
		lead = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles.get(0));
		return new MergeLeadsPage(driver);
	}
	
	
	public MergeLeadsPage clickFirstResultLeadIDToLeadWindow()
	{
		//lead = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles.get(0));
		return new MergeLeadsPage(driver);
	}
	
	
	public FindLeadsWindowPage enterFirstName2Window() throws InterruptedException
	{
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("bond");
		Thread.sleep(4000);
		return this;
	}
	
	
}
