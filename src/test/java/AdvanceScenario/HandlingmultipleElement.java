package AdvanceScenario;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingmultipleElement {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.flipkart.com");
        driver.findElement(By.xpath("//button[text()='✕']")).click();
      List<WebElement> alllinks = driver.findElements(By.xpath("//a"));
      
      int count=0;
      for(WebElement webEle:alllinks)	
    {  
       System.out.println(webEle.getText());
       count++;
    	  
	}
      System.out.println("total no of links:"+count);
}
}