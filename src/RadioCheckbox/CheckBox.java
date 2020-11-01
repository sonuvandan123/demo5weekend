package RadioCheckbox;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","D://Selenium Training//chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		//driver.get("https://the-internet.herokuapp.com/checkboxes");
		driver.get("https://www.seleniumeasy.com/test/basic-checkbox-demo.html");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("(//input[@type='checkbox'])[2]")).click();
		//driver.findElement(By.xpath("//input[@id='isAgeSelected']")).click();
		//Thread.sleep(2000);
		boolean result=driver.findElement(By.xpath("//input[@id='isAgeSelected']")).isSelected();
		//System.out.println(result);
	}

}
