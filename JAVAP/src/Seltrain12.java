import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seltrain12 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/project_workspace(agx7453)/JAVAP/chromedriver/chromedriver.exe");
		WebDriver myD=new ChromeDriver();
		myD.manage().window().maximize();
		myD.get("https://demoqa.com/alerts");
		myD.findElement(By.xpath("(//button[@type='button'])[2]")).click();
		Thread.sleep(4000);
		myD.switchTo().alert().accept();
		myD.findElement(By.xpath("(//button[@type='button'])[4]")).click();
		Thread.sleep(4000);
		myD.switchTo().alert().dismiss();
		Thread.sleep(4000);
		myD.findElement(By.xpath("(//button[@type='button'])[5]")).click();
		Thread.sleep(4000);
		myD.switchTo().alert().sendKeys("Sam");
		myD.switchTo().alert().accept();
		Thread.sleep(4000);
		myD.close();

	}

}
