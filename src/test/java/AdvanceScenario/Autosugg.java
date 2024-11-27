package AdvanceScenario;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosugg {

	public static void main(String[] args) {
		
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	/*	  //List<WebElement> suggestion = driver.findElements(By.xpath("//div[@class='s-suggestion-container']\""));
		driver.findElement("//div[@class='autocomplete-results-container']/child::div"));*/
		
driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("bluetooth",Keys.ENTER);
	}

}
