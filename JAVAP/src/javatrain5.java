import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javatrain5 {

	public static void main(String[] args) {
//  to check if type or any attribute has more same type
		System.setProperty("webdriver.chrome.driver", "D:/project_workspace(agx7453)/JAVAP/chromedriver/chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.get("https://www.google.com/");
		  driver.manage().window().maximize();
		  String b= driver.getTitle();
		  System.out.println(b);
		  
		//div[@id='navbar']/div[5]/div[2]/div/div/a[1]    https://www.amazon.in/
		////div[@id='nav-xshop']/a[1]
		  ////div[@class='repayment-block']/div[1]/div[1]/h3   https://www.mortgagecalculator.org/
		  ////div[@class='repayment-block']/div[1]/div[1]/h3
	}

}
