package Marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Redbus {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver=new ChromeDriver();

		driver.get("https://www.redbus.in/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@id='src']")).sendKeys("Chennai");
		
		driver.findElement(By.xpath("//ul[@class='autoFill homeSearch']/li[@data-id='123']")).click();
		
		driver.findElement(By.xpath("//input[@id='dest']")).sendKeys("Bangalore");
		
		driver.findElement(By.xpath("//ul[@class='autoFill homeSearch']/li[@data-id='122']")).click();

		driver.findElement(By.xpath("//label[text()='Date']")).click();
		
		driver.findElement(By.xpath("//table[@class='rb-monthTable first last']//td[@class='current day']")).click();
	
		driver.findElement(By.xpath("//button[text()='Search Buses']")).click();
	
		System.out.println(driver.findElement(By.xpath("//span[@class='w-60 d-block d-found']")).getText());
		
		driver.findElement(By.xpath("//ul[@class='list-chkbox']//label[@for='bt_SLEEPER']")).click();
		
		System.out.println(driver.findElement(By.xpath("(//div[@class='travels lh-24 f-bold d-color'])[2]")).getText());
	
		driver.findElement(By.xpath("(//div[@class='button view-seats fr'])[2]")).click();
		
		driver.close();
	}

}
