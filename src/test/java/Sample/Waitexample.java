package Sample;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

/*public class Waitexample {

	public static void main(String[] args) {
		
		String key="webdriver.chrome.driver";
		String value="";
		System.setProperty(key, value);
		WebDriver driver= new ChromeDriver();
		
		//implicitly wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin",Keys.TAB,"manager",Keys.ENTER);

		//exlicitly wait
		WebDriverWait wait = new WebDriverWait(driver,ofseconds(20));
	    wait.until(Expectedconditions.titlecontains("Enter Time-Track"));
	
	   //syntax
	    /*FluentWait wait=new FluentWait(driver);
		 wait.polingEvery(Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(Element));
		
	}

}*/
