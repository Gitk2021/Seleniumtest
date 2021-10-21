import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class javatrain7 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/project_workspace(agx7453)/JAVAP/chromedriver/chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.get("https://www.amazon.in/");
		  driver.manage().window().maximize();
		  String b= driver.getTitle();
		  System.out.println(b);
		  
		  Actions act=new Actions(driver);
		  
		  act.moveToElement(driver.findElement(By.id("nav-link-accountList-nav-line-1"))).build().perform();
		  
	}

}
