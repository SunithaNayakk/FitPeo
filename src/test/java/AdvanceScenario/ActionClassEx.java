package AdvanceScenario;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClassEx {

	public static void main(String[] args) {
		WebDriverManager.edgedriver().setup();
		WebDriver driver =new EdgeDriver();
		/*driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement data = driver.findElement(By.xpath("//div[text()='Beauty,Toy & More']"));

		Actions act= new Actions(driver);
		//act.moveToElement(data).perform();
		act.contextClick(data).perform();*/


		/*driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement data = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
		Actions act= new Actions(driver);
		act.doubleClick(data).perform();*/


		/*driver.get("https://jqueryui.com/resources/demos/droppable/default.html");
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		Actions act=new Actions(driver);
		act.dragAndDrop(drag, drop).perform();*/

		driver.get("http://demo.actitime.com/login.do");
		WebElement USERNAME = driver.findElement(By.id("username"));
		WebElement PASSWORD = driver.findElement(By.name("pwd"));
		WebElement LOGIN = driver.findElement(By.id("loginButton"));

		Actions act=new Actions(driver);
		//act.sendKeys(USERNAME, "admin").perform();
		//act.sendKeys(PASSWORD, "manager").perform();
	//	act.sendKeys(LOGIN).build().perform();

		act.sendKeys(USERNAME, "admin").sendKeys(PASSWORD, "manager").sendKeys(LOGIN).build().perform();

	}

}
