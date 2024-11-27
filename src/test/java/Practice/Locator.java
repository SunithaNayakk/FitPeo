package Practice;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("http://demo.actitime.com/login.do");
		//using id locator
	//	driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.className("textField")).sendKeys("admin");
		//using name locator
	    driver.findElement(By.name("pwd")).sendKeys("manager");
	    //using id locator
     // driver.findElement(By.id("loginButton")).click();
      //classname=class
	    driver.findElement(By.className("initial")).click();
	   
	}
}
