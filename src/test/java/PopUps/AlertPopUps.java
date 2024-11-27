package PopUps;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPopUps {

	public static void main(String[] args) {
		
        WebDriver driver=new ChromeDriver();
	   //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[2]")).click();
		driver.findElement(By.xpath("//a[text()='Types of work']")).click();
		driver.findElement(By.xpath("(//span[text()='Create Types of work']")).click();
        driver.findElement(By.id("name")).sendKeys("qspiders");
		driver.findElement(By.xpath("(//input[contains(@value,' Cancel')]")).click();

	   Alert alt=driver.switchTo().alert();
	    alt.accept();
		//alt.dismiss();

	}

}
