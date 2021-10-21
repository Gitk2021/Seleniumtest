import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seltrain10 {

	
	public static String vText;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "D:/project_workspace(agx7453)/JAVAP/chromedriver/chromedriver.exe");
		  WebDriver myD= new ChromeDriver();
		myD.manage().window().maximize();


		myD.get("https://jqueryui.com/droppable/");
		vText=myD.findElement(By.className("entry-title")).getText();
		System.out.println("Text from Main Section : "+vText);

		int fSize=myD.findElements(By.tagName("iframe")).size();
		System.out.println("Total No of Frames :"+fSize);

		//myD.switchTo().frame(0);
		//myD.switchTo().frame("name or ID");
		myD.switchTo().frame(myD.findElement(By.className("demo-frame")));

		vText=myD.findElement(By.id("draggable")).getText();
		System.out.println("Text from Draggable Object : "+vText);

		Thread.sleep(4000);

		myD.close();

	}

}
