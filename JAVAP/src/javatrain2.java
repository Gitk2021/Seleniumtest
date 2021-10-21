import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class javatrain2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/project_workspace(agx7453)/JAVAP/chromedriver/chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.get("http://www.youcandealwithit.com/borrowers/calculators-and-resources/calculators/budget-calculator.shtml");
		  driver.manage().window().maximize();
		  String b= driver.getTitle();
		  System.out.println(b);
		  driver.findElement(By.id("food")).sendKeys("200");
		  driver.findElement(By.id("clothing")).sendKeys("200");
		  driver.findElement(By.id("shelter")).sendKeys("200");
		  driver.findElement(By.id("monthlyPay")).sendKeys("300");
		  driver.findElement(By.id("monthlyOther")).sendKeys("400");
		  
		  WebElement MonthlyIncome = driver.findElement(By.xpath("//*[@id=\"totalMonthlyIncome\"]"));
		  System.out.println("Total Monthly Income:"+ MonthlyIncome.getAttribute("value"));
		 
		  String MONTHLYEXPENSE = driver.findElement(By.xpath("//*[@id=\"totalMonthlyExpenses\"]")).getAttribute("value");
		  System.out.println("Total Monthly Expenses:"+MONTHLYEXPENSE);
		  
		  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		  driver.close();

	}

}
