package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

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
		
		WebElement eleSource = driver.findElement(By.id("createLeadForm_dataSourceId"));
		
		Select dd=new Select(eleSource);
		
		dd.selectByValue("LEAD_CONFERENCE");
		
		driver.findElement(By.name("submitButton")).click();
		
		driver.findElement(By.linkText("Edit")).click();
		
		driver.findElement(By.id("updateLeadForm_description")).clear();
		
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("abcxyz***");
		
		driver.findElement(By.name("submitButton")).click();
			
		System.out.println(driver.getTitle());
		
		//driver.close();
		
	}

}
