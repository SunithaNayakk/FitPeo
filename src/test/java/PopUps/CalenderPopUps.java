package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalenderPopUps {

	public static void main(String[] args) {
	
	     	WebDriver driver=new ChromeDriver();
		  //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			
		    driver.get("https://www.makemytrip.com");
		   driver.findElement(By.xpath("//span[text()='Departure']")).click();
		   
		   driver.findElement(By.xpath("//div[text()='May 2023']"
				   +"/ancestor::div[@class='DayPicker-Month']/decendant::p[text()='10']")).click();
	
	}

}
