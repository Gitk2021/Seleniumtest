import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class javatrain4 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/project_workspace(agx7453)/JAVAP/chromedriver/chromedriver.exe");
		  WebDriver driver= new ChromeDriver();
		  driver.get("https://www.google.com/");
		  driver.manage().window().maximize();
		  String b= driver.getTitle();
		  System.out.println(b);
		  
		  int Lsize = driver.findElements(By.tagName("a")).size();
		  
		  System.out.println(Lsize);
		  
		  for (int i=0; i<=Lsize; i++){
			  
			//String vLink=myD.findElements(By.tagName("a")).get(i).getAttribute("href");
              String vLinkText=driver.findElements(By.tagName("a")).get(i).getText();
              System.out.println(vLinkText);
              
              if(vLinkText.contains("Gmail"))
              {
                  driver.findElements(By.tagName("a")).get(i).click();
                  break;
              }
		  }

	}

}
