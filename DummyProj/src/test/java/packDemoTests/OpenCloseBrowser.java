package packDemoTests;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class OpenCloseBrowser {
	
	public WebDriver driver;
	public String url,title;
	public WebDriverWait wait;
	
	@BeforeTest
	public void openBrowser()
	{
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		System.out.println("My Chrome browser is launched");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	@AfterTest
	public void closeBrowser()
	{
		driver.quit();
		System.out.println("Browser closed");
	}

	public void LaunchApplication(String pageUrl)
	{
		driver.get(pageUrl);
		title=driver.getTitle();
		System.out.println("Home Page : " + title);		
	}
}
