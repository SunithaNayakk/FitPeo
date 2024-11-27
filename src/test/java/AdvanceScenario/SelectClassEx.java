package AdvanceScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectClassEx {

	public static void main(String[] args) throws Throwable {
	
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
        driver.findElement(By.xpath("//a[text()='Create new account']")).click();  
        
        Thread.sleep(1000);
       WebElement datelist = driver.findElement(By.id("day"));
       Select sel=new Select(datelist);
       sel.selectByIndex(20);
       //sel.selectByValue("20")
       
       WebElement monthList =driver.findElement(By.id("month"));
       Select sele=new Select(monthList);
       sel.selectByIndex(9);
       //sel.selectByValue("9")
       
       
       WebElement yearList = driver.findElement(By.id("year"));
       Select selec=new Select(yearList);
       sel.selectByIndex(0);
       
       
       
	}
	
	

}
