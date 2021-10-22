package MAVENintSELtest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Mavesel1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/project_workspace(agx7453)/JAVAP/chromedriver/chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  
		  driver.manage().window().maximize();
		  
		  driver.get("https://www.mortgagecalculator.org/");
		  
		  Thread.sleep(3000);
		  
		  driver.findElement(By.id("homeval")).sendKeys("30000");
		  
		  Thread.sleep(3000);

		  driver.findElement(By.id("downpayment")).sendKeys("3000");
		  
		  Thread.sleep(3000);

		 // driver.findElement(By.xpath("//*[@id=\"calc\"]/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[1]/div[1]/div[2]/span/label[2]/input")).click();
		  
		  driver.findElement(By.xpath("//*[@value='percent']")).click();
		  
		  Thread.sleep(3000);

		  driver.findElement(By.id("loanterm")).sendKeys("20");
		  
		  Thread.sleep(3000);

		 Select dropdown = new Select ( driver.findElement(By.xpath("//*[@id=\"calc\"]/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[1]/div[1]/div[13]/select")));
		 
		 dropdown.selectByValue("4");
		 
		  Thread.sleep(3000);

		 driver.findElement(By.xpath("//*[@id=\"calc\"]/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[1]/div[1]/div[17]/input")).click();
		 
		 String income = driver.findElement(By.xpath("//*[@id=\"calc\"]/form/section/section[2]/div/div/div[1]/div/div/div[4]/div[2]/div/div[1]/div[1]/h3")).getText();
		  
		  Thread.sleep(3000);

		 System.out.println("Total Monthly Payment: "+income);
		 
		 //driver.close();

	}

}
