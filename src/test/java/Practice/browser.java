package Practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class browser {

	public static void main(String[] args) {

		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.get("https://www.amazon.in/");
		//driver.get("https://www.flipkart.com");
		String data = driver.getTitle();
		System.out.println(data);

		//String data1 = driver.getTitle();
		//System.out.println(data1);

		String code = driver.getPageSource();
		System.out.println(code);
		driver.manage().window().maximize();

		String URL = driver.getCurrentUrl();
		System.out.println(URL);
		driver.quit();

	}

}
