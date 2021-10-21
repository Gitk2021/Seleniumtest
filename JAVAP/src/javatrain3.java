import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javatrain3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "D:/project_workspace(agx7453)/JAVAP/chromedriver/chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.get("https://www.linkedin.com/login");
		  driver.manage().window().maximize();
		  String b= driver.getTitle();
		  System.out.println(b);
		  driver.findElement(By.id("username")).sendKeys("msk");
		  driver.findElement(By.id("password")).sendKeys("msk");
//		  $x("//button[text() ='Sign in']")  to check path 
//		 driver.findElement(By.xpath("//*[@aria-label ='Sign in']")).click();
//		 driver.findElement(By.xpath("//button[@aria-label ='Sign in']")).click();
//		 driver.findElement(By.xpath("//*[@class ='btn__primary--large from__button--floating']")).click();
//		 driver.findElement(By.xpath("//*[@aria-label ='Sign in'and @type='submit']")).click();
         driver.findElement(By.xpath("//button[text() ='Sign in']")).click();
       

	}

}
