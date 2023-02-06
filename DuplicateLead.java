package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
				
		driver.get("http://leaftaps.com/opentaps/control/login");
				
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
				
		driver.findElement(By.id("password")).sendKeys("crmsfa");
			
		driver.findElement(By.className("decorativeSubmit")).click();
						
		driver.findElement(By.linkText("CRM/SFA")).click();
				
		driver.findElement(By.linkText("Leads")).click();
				
		driver.findElement(By.linkText("Create Lead")).click();
		
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf Solutions");
		
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Jenifer");
		
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Aniston");
		
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Jenny");
		
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
		
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Software Testing");
		
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jennyaniston@gmail.co.uk");
		
		driver.findElement(By.name("submitButton")).click();
		
		System.out.println(driver.getTitle());
		
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		WebElement ele = driver.findElement(By.id("createLeadForm_companyName"));
		
		ele.clear();
		
		ele.sendKeys("IT Solutions");
		
		WebElement firstName = driver.findElement(By.id("createLeadForm_firstName"));
		
		firstName.clear();
		
		firstName.sendKeys("Emily");
		
		driver.findElement(By.name("submitButton")).click();
				
		System.out.println(driver.getTitle());
		
		driver.close();
		
	}

}
