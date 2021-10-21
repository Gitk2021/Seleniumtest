import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class javatrain {

	public static void main(String[] args) {

		
		  Scanner msk= new Scanner (System.in);
		  String a= msk.nextLine();
		  
		if (a.equalsIgnoreCase("Edge")){
			
			System.setProperty("webdriver.edge.driver", "D:/project_workspace(agx7453)/JAVAP/edgedrive/msedgedriver.exe");
			 WebDriver driver= new EdgeDriver();
			 driver.get("https://www.selenium.dev/downloads/");
		     driver.manage().window().maximize();
		      String b= driver.getTitle();
		      System.out.println(b);
		}
		else if(a.equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "D:/project_workspace(agx7453)/JAVAP/chromedriver/chromedriver.exe");
			//System.setProperty("webdriver.chrome.driver", "D:\project_workspace(agx7453)\JAVAP\edgedrive\msedgedriver.exe");
			  WebDriver driver= new ChromeDriver();
			  driver.get("https://www.selenium.dev/downloads/");
			  driver.manage().window().maximize();
			  String b= driver.getTitle();
			  System.out.println(b);
			}
		else {
			System.out.println("Out of lane");
			
		}
}}
