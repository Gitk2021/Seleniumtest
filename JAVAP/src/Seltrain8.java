import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seltrain8 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/project_workspace(agx7453)/JAVAP/chromedriver/chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.get("https://www.google.com/");
		  driver.manage().window().maximize();
		  String b= driver.getTitle();
		  System.out.println(b);
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  driver.findElement(By.linkText("Gmail")).click();
		  System.out.println(driver.getTitle());
		  driver.findElement(By.xpath("/html/body/header/div/div/div/a[2]")).click();
		  driver.getTitle();
		  driver.findElement(By.linkText("Help")).click();
		  System.out.println(driver.getTitle());
		  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		  
		  Set<String> Ids= driver.getWindowHandles();
		  Iterator<String> it =Ids.iterator();
		  
		  String mailwindow = it.next();
		  String helpwindow = it.next();
		  
		  driver.switchTo().window(helpwindow);
		  System.out.println(driver.getTitle());
		  driver.quit();
	}

}
