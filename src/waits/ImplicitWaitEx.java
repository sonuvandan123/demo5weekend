package waits;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitEx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D://Selenium Training//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.xpath("//input[@class='LM6RPg']")).sendKeys("Laptop");
		//Thread.sleep(30000);
		driver.findElement(By.xpath("//button[@class='vh79eN']")).click();
		//Thread.sleep(30000);
		List<WebElement> list= driver.findElements(By.xpath("//div[@class='_3wU53n']"));
		for (WebElement webElement : list) {
			System.out.println("Laptop");
			System.out.println(webElement.getText());
		}
	}

}
