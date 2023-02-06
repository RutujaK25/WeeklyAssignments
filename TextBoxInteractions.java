package Week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextBoxInteractions {

	public static void main(String[] args) {
		//set up browser
		
		WebDriverManager.chromedriver().setup();
		
		//Open the Chrome Browser
		ChromeDriver driver=new ChromeDriver();
				
		//Load the url
		driver.get("https://www.leafground.com/input.xhtml");
				
		//Maximise the window
		driver.manage().window().maximize();
		
		//Append the text
		driver.findElement(By.id("j_idt88:j_idt91")).sendKeys("Madurai");
		
		//Clear the text
		//driver.findElement(By.id("j_idt88:j_idt95")).clear();
		//driver.findElement(By.id("j_idt88:j_idt95")).sendKeys("Some Text");
		
		//or for multiple oprations
		WebElement ele = driver.findElement(By.id("j_idt88:j_idt95"));
		
		ele.clear();
		
		ele.sendKeys("Some Text");
		
		//to retrive the text present in text field
		String value = ele.getAttribute("value");
		
		System.out.println(value);
		
		boolean enabled = ele.isEnabled();

		System.out.println(enabled);
		
		//for radio button or checkbox
		boolean selected = ele.isSelected();
		
		//to check element is present or not 
		boolean displayed = ele.isDisplayed();
	}

}
