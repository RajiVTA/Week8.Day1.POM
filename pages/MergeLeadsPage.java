package com.testleaf.pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.testleaf.base.ProjectSpecificMethods;

public class MergeLeadsPage  extends ProjectSpecificMethods {
	
	public MergeLeadsPage(ChromeDriver driver)
	{
		this.driver=driver;
	} 

	public FindLeadsWindowPage lookupFromLead()
	{
		driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
		
		allWindows = driver.getWindowHandles();
		allhandles = new ArrayList<String>(allWindows);
		
		driver.switchTo().window(allhandles.get(1));
		return new FindLeadsWindowPage(driver);
		
	}
	
	public FindLeadsWindowPage lookupToLead()
	{
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();

		allWindows2 = driver.getWindowHandles();
		allhandles2 = new ArrayList<String>(allWindows2);
		
		driver.switchTo().window(allhandles2.get(1));
		return new FindLeadsWindowPage(driver);

	}
	
	
	public LeadsPage clickMergeButtonAndConfirm() throws InterruptedException
	{
				driver.findElement(By.xpath("//a[text()='Merge']")).click();
				driver.switchTo().alert().accept();
				Thread.sleep(9000);
				return new LeadsPage(driver);
	}
	
	
}
