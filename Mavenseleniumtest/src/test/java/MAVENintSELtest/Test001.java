package MAVENintSELtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Test001 {
	
	public WebDriver driver;
		
	@Test 
	public void test1() throws InterruptedException
	{
		
		
		System.setProperty("webdriver.chrome.driver", "D:/project_workspace(agx7453)/JAVAP/chromedriver/chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.manage().window().maximize();
		
		driver.get("https://www.mortgagecalculator.org/");
		  
		  		 //driver.close();

		
	}

}
