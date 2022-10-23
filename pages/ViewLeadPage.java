package com.testleaf.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificMethods;

public class ViewLeadPage  extends ProjectSpecificMethods{

	public ViewLeadPage(ChromeDriver driver)
	{
		this.driver=driver;
	}
	
	
	public EditLeadPage clickEditButton()
	{

		driver.findElement(By.linkText("Edit")).click();
		return new EditLeadPage(driver);
	}
	
	public DuplicateLeadPage clickDuplicateLeadButton()
	{

		driver.findElement(By.linkText("Duplicate Lead")).click();
		return new DuplicateLeadPage(driver);
	}
	
	public LeadsPage clickDeleteButton() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		Thread.sleep(9000);
		return new LeadsPage(driver);
	}
	
	
}
