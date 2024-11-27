package PopUps;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadPopups {
	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.monsterindia.com/");

		driver.findElement(By.xpath("//div[contains(text(),' Upload Resume')]")).click();
		driver.findElement(By.xpath("//input[@name='file']")).sendKeys("file:///G:/QSPIDER/MANUAL%20TESTING/M.Sathish%20%20MT%20-%201%20.pdf");

	}


}
