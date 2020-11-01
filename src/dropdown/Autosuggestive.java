package dropdown;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestive {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D://Selenium Training//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("ind");
		Thread.sleep(2000);
		String name="";
		List<WebElement> list=driver.findElements(By.xpath("//div[@class='sbl1']"));
		
		for (WebElement webElement : list) {
			name=webElement.getText();
			if(name.equalsIgnoreCase("india map"))
			{
				webElement.click();
				break;
			}
		//System.out.println(webElement.getText());
		}
	}
	

}
