import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Learn {

	
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D://project_workspace(agx7453)//Demo//chromedriver//chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  
		driver.get("www.google.com");
		driver.getTitle();
		driver.close();
			
	}

}
