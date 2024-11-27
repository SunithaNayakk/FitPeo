package AdvanceScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SvgElements {

	public static void main(String[] args) {
		
      WebDriver driver=new ChromeDriver();	
      driver.get("https://www.google.com/");
      driver.manage().window().maximize();
     driver.findElement(By.xpath("//*[name()='svg' and  @class='gb_h']")).click();
		//driver.findElement(By.xpath("(//*[name()='svg' and  @focusable='false'])[1]")).click();
		
		
	}

}
