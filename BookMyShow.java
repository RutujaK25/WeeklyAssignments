package Marathon;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BookMyShow {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

		ChromeDriver driver=new ChromeDriver();

		driver.get("https://in.bookmyshow.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//input[@class='sc-hCaUpS cLnzvB']")).sendKeys("Hyderabad");

		driver.findElement(By.xpath("//span[@class='sc-dBaXSw gYlrLO']")).click();
		
		String text = driver.findElement(By.xpath("//span[@class='sc-kZmsYB ekDEWP ellipsis']")).getText();
	
		if(text.equalsIgnoreCase("Hyderabad"))
		{
			System.out.println("Url is loaded with Hyderabad");
		}
		
		driver.findElement(By.xpath("//span[text()='Search for Movies, Events, Plays, Sports and Activities']")).click();
		
		driver.findElement(By.xpath("//input[@class='sc-hCaUpS cLnzvB']")).sendKeys("Pathaan");
		
		driver.findElement(By.xpath("//div[@class='sc-dXfzlN iPwaRU']")).click();

		driver.findElement(By.xpath("//span[text()='Book tickets']")).click();
		
		driver.findElement(By.xpath("//div[@class='sc-vhz3gb-3 dRokFO']/span[text()='4DX']")).click();
		
		driver.findElement(By.xpath("//button[@class='No thanks']")).click();
		
		System.out.println(driver.findElement(By.xpath("//a[@class='__venue-name']")).getText());
		
		driver.findElement(By.xpath("//div[@class='venue-info-text']")).click();
		
		String text2 = driver.findElement(By.xpath("//div[@class='venue-facilities-wrapper']//div[3]")).getText();
		
		if(text2.equalsIgnoreCase("Parking Facility"))
				
		{
			System.out.println("Parking is available");
		}
		else
		{
			System.out.println("No parking");
		}
		
		driver.findElement(By.xpath("//div[@class='cross-container']")).click();
	
		driver.findElement(By.xpath("//div[@class='showtime-pill-container _available']")).click();
		
		driver.findElement(By.xpath("//div[@id='btnPopupAccept']")).click();
		
		driver.findElement(By.xpath("//ul[@id='popQty']/li[text()='1']")).click();
		
		driver.findElement(By.xpath("//div[@id='proceed-Qty']")).click();
	
		driver.findElement(By.xpath("//div[@id='A_6_017']/a")).click();
		
		driver.findElement(By.xpath("//div[@class='__seat-action btn-bar _centered _spaced']/a")).click();
		
		System.out.println(driver.findElement(By.xpath("//span[@id='subTT']")).getText());
	
		driver.findElement(By.xpath("//div[@id='prePay']")).click();
		
		driver.close();
	
	}
	
}


