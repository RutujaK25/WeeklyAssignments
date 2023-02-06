package Week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnDropdown {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver=new ChromeDriver();
		
		driver.get("https://www.leafground.com/select.xhtml");
		
		driver.manage().window().maximize();
		
		//Identify the Select tag element
		
		WebElement eleTool = driver.findElement(By.className("ui-selectonemenu"));
	
		//Create an object for Select class
		
		Select dd=new Select(eleTool);
		
		//select the option
		//1.using index
		//dd.selectByIndex(1);
		
		//2.Using visible Text
		dd.selectByVisibleText("Playwright");
		
		//3.Using value attribute
		//dd.selectByValue("");
		
		//to get the available options in dropdown
		List<WebElement> options = dd.getOptions();
		
		for (int i = 0; i < options.size(); i++) {
			
			WebElement option = options.get(i);
			
			String text = option.getText();
			
			System.out.println(text);
			
			for (WebElement eachOption : options) {
				
				System.out.println(eachOption.getText());
				
				//to retrieve first selected option
				
				WebElement firstSelectedOption = dd.getFirstSelectedOption();
				
				System.out.println(firstSelectedOption.getText());
				
			}
			
		}
		
	}
	

}
