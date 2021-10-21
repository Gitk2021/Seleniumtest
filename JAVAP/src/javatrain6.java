import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class javatrain6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/project_workspace(agx7453)/JAVAP/chromedriver/chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.get("https://www.amazon.in/");
		  driver.manage().window().maximize();
		  String b= driver.getTitle();
		  System.out.println(b);
		  Thread.sleep(4000);
		  Select searchDropdownBox=new Select(driver.findElement(By.id("searchDropdownBox")));
		  
		  searchDropdownBox.selectByIndex(2);
		  
		  Thread.sleep(4000);
	    
//		  searchDropdownBox.deselectByVisibleText("Baby");
	      Thread.sleep(4000);
    	  searchDropdownBox.selectByValue("search-alias=mobile-apps");
     	  Thread.sleep(4000);
     	  searchDropdownBox.selectByVisibleText("Baby");
     	 Thread.sleep(4000);
    	  driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
 		  Thread.sleep(4000);
     	  driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
     	 Thread.sleep(5000);
		  driver.findElement(By.xpath("//*[@id=\"p_90/6741118031\"]/span/a/div/label/i")).click();
		  Thread.sleep(5000);
		  
		  driver.close();

	}

}
