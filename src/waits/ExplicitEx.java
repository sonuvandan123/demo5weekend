package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitEx {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D://Selenium Training//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		//Hard wait
		WebDriverWait wait=new WebDriverWait(driver,20);
		driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		driver.findElement(By.xpath("//button")).click();
		//Thread.sleep(10000);
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='finish']")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='finish']")));
		
		String text=driver.findElement(By.xpath("//div[@id='finish']")).getText();
		System.out.println("Value="+text);

	}

}
