package AdvanceScenario;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RobotClassEx {

	public static void main(String[] args) throws  Throwable {
		
       WebDriver driver=new ChromeDriver();
		
		driver.get("http://demo.actitime.com/login.do");
	    driver.findElement(By.id("username")).sendKeys("admin");
	    driver.findElement(By.name("pwd")).sendKeys("manager");
      Robot r=new Robot();
      r.keyPress(KeyEvent.VK_ENTER);
//      r.keyPress(Keys.ENTER);
    		  
      
      
	    
	    
	}

}
