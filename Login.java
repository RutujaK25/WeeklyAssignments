package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Login {

	public static void main(String[] args) {
		
		//Set up the driver
		WebDriverManager.chromedriver().setup();
		
		//Open the Chrome Browser
		ChromeDriver driver=new ChromeDriver();
		//EdgeDriver driver=new EdgeDriver();
		//Load the url
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximise the window
		driver.manage().window().maximize();
		
		//Enter the username
		WebElement eleUserName = driver.findElement(By.id("username"));
		eleUserName.sendKeys("DemoSalesManager");
		
		//Enter the password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//to click button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//using locator linkText
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Create lead
		driver.findElement(By.linkText("Leads")).click();
		
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf Solutions");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Rutuja Kulbhushan");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Mothe");
		
		driver.findElement(By.name("submitButton")).click();
		
		String firstName = driver.findElement(By.id("viewLead_firstName_sp")).getText();
		
		System.out.println(firstName);
		
		if(firstName.equalsIgnoreCase("Rutuja Kulbhushan"))
		{
			System.out.println("First name is correct");
		}
		else
		{
			System.out.println("First name is incorrect");
		}
		
		driver.close();
	}

}


