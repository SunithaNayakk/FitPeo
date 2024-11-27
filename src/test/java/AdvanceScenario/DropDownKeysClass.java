package AdvanceScenario;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownKeysClass {

	public static void main(String[] args) throws Exception{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);//long = datatype 10.00 10
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();  


		Thread.sleep(1000);
		Select select = new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("4");
		driver.quit();
	}

}
