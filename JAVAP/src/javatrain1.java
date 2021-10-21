import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javatrain1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:/project_workspace(agx7453)/JAVAP/chromedriver/chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.get("https://www.linkedin.com/login");
		  driver.manage().window().maximize();
		  String b= driver.getTitle();
		  System.out.println(b);
		  driver.findElement(By.id("username")).sendKeys("msk");
		  driver.findElement(By.id("password")).sendKeys("msk");
		  driver.findElement(By.xpath("//*[@id=\"organic-div\"]/form/div[3]/button")).click();
		  
		  String err = driver.findElement(By.id("error-for-username")).getText();
		  
		  System.out.println(err);
		  
		  driver.findElement(By.partialLinkText("Forgot")).click();
		  System.out.println(driver.getTitle());
		  
		  driver.findElement(By.linkText("Join now")).click();
		  
		  System.out.println(driver.getTitle());
		  
		  Thread.sleep(4000);
		  
		 // driver.close();
	}

}
