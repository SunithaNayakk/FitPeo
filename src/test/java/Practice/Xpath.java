package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args)  throws Throwable
	 {
	
		WebDriver driver=new ChromeDriver();
		
		//driver.get("http://demo.actitime.com/login.do");
		//driver.manage().window().maximize();
		
		// 1. xpath attribute
		//      //htmltag[@keyatribute name='keyattribute value']
		//driver.findElement(By.xpath("//input[@id='username']")).sendKeys("admin");
		//driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		
		//driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
      //  driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
        
        //  2.xpath visible text
        //       //htmltag[text()='visible text']
       // driver.findElement(By.xpath("//div[text()='Login ']")).click();
       // Thread.sleep(1000);
       // driver.findElement(By.xpath("//a[text()='Lock Time-Track']")).click();
        
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
        driver.findElement(By.xpath("//div[text()='Mobiles']")).click();
        
        driver.quit();
        
	}

}
