package dropdown;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdown {

	public static void main(String[] args)
	{
		// browser // relevant driver
		System.setProperty("webdriver.chrome.driver","D://Selenium Training//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.wikipedia.org/");
		//driver.findElement(By.xpath("//select[@id='searchLanguage']")).sendKeys("Esperanto");
		WebElement element =driver.findElement(By.xpath("//select[@id='searchLanguage']"));
		element.click();
		Select select=new Select(element); 
		//select.selectByIndex(5);
		//select.selectByValue("az");
		//select.selectByVisibleText("Cymraeg");
		List<WebElement> list=select.getOptions();
		for (WebElement web : list) {
				System.out.println(web.getText());
			
		}
		/*
		 * for (Object web : list) { System.out.println(((WebElement) web).getText());
		 * 
		 * }
		 */
		
	}

}
