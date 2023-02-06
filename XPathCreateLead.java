package Week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XPathCreateLead {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@class='inputLogin']")).sendKeys("DemoSalesManager");
		
		driver.findElement(By.xpath("//input[@name='PASSWORD']")).sendKeys("crmsfa");
		
		driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
		
		driver.findElement(By.xpath("//a[contains (text(),'CRM/SFA')]")).click();
		
		driver.findElement(By.xpath("//a[text()='Leads']")).click();
		
		driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
		
		driver.findElement(By.xpath("//input[contains(@id,'createLeadForm')]")).sendKeys("TestLeaf Solutions");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Emily");
		
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Watkinson");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();

		driver.close();
	}

}
