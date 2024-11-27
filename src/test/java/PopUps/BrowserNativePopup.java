package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;

public class BrowserNativePopup {

	public static void main(String[] args) {
		//WebDriver driver =new EdgeDriver();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		/*EdgeOptions option= new EdgeOptions();
		option.addArguments("InPrivate");
		WebDriver driver =new EdgeDriver(option);
		driver.manage().window().maximize();*/
		
		ChromeOptions option= new ChromeOptions();
		option.addArguments("incognito");
		WebDriver driver =new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.yatra.com");

	}

}
