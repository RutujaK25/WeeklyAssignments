package Week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathFacebook {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com");
		
		driver.manage().window().maximize();
		 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//div[@class='_4t2a']//button[text()='Allow essential and optional cookies']")).click();
		
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Alexa");
		
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Jenkins");
		
		driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("07884878498");
		
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("alejenkins89");
		
		WebElement eleTool = driver.findElement(By.name("birthday_day"));
		
		Select dd = new Select(eleTool);
		
		dd.selectByValue("25");
		 
		WebElement eleTool2 = (driver.findElement(By.name("birthday_month")));
		
		Select dd2 = new Select(eleTool2);
				 
		dd2.selectByValue("3");
		
		WebElement eleTool3 = (driver.findElement(By.name("birthday_year")));
		
		Select dd3 = new Select(eleTool3);
				 
		dd3.selectByValue("1998");
		
		driver.findElement(By.xpath("//input[@type='radio']")).click();
		
		driver.findElement(By.xpath("//button[@class='_6j mvm _6wk _6wl _58mi _3ma _6o _6v']")).click();
		
		driver.findElement(By.xpath("//input[@name='contactpoint']")).sendKeys("rutujakmothe@gmail.com");
		
		driver.close();
	
	}

}
