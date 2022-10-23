package com.testleaf.base;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;

import com.testleaf.utils.ReadExcelData;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ProjectSpecificMethods {
	
	
	public ChromeDriver driver;
	public String fileName;
	public static String LeadID, lead;
	//public static String LeadIdentifier=LeadID;
	public static Set<String> allWindows, allWindows2; 
	public static List<String> allhandles, allhandles2;

	
	
	@BeforeMethod
	public void preCondition()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
	}

	
	@AfterMethod
	public void postCondition() throws InterruptedException
	{
		//Thread.sleep(10000);
		//driver.close();
	}
	
	@DataProvider(name="fetchData")
	public String[][] fetchData() throws IOException
	{
		return ReadExcelData.readSheetData(fileName);
	}
}
