package SUNI;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Autosuggtask {

	public static void main(String[] args) throws Throwable {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://google.com");
       
		driver.findElement(By.name("q")).sendKeys("suni");
		
		List<WebElement> list = driver.findElements(By.xpath("//div[@class='primary-side']"));
        System.out.println(list);  
	}

}
