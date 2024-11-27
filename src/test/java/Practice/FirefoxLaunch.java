package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxLaunch {

	public static void main(String[] args) {

		//WebDriverManager.firefoxdriver().setup();
		//WebDriver driver=new FirefoxDriver();
		//driver.get("https://www.flipkart.com");

		//String key="webdriver.firefox.driver";
		//String value="./msedgedriver.exe";
		//	System.setProperty(key, value);
		//	WebDriver driver=new FirefoxDriver();

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		driver.get("https://www.flipkart.com");

		//WebDriverManager.chromedriver().setup();
		//WebDriver driver = new ChromeDriver();
		//driver.get("https://www.amazon.in/");
		//driver.quit();


	}

}
