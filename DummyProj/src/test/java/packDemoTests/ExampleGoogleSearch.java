package packDemoTests;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

public class ExampleGoogleSearch extends OpenCloseBrowser
{
	@Test
	public void TestGoogleSearch() throws Exception
	{
		LaunchApplication("http://google.com");
		
		driver.findElement(By.name("q")).sendKeys("Selenium");
		//Thread.sleep(5000);
		WebElement searchButton=driver.findElement(By.name("btnK"));
		wait.until(ExpectedConditions.elementToBeClickable(searchButton));
		searchButton.click();
		wait.until(ExpectedConditions.titleContains("Search"));
		title=driver.getTitle();
		System.out.println("Search Page : " + title);
		
		driver.findElement(By.xpath("//div[@id='rso']/descendant::a[1]")).click();
		
		wait.until(ExpectedConditions.urlContains("selenium"));
		title=driver.getTitle();
		System.out.println("Selenium Page : " + title);
		System.out.println("Current Page URL : " + driver.getCurrentUrl());
		
	}

}
