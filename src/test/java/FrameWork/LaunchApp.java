package FrameWork;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import POM.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LaunchApp {

	public static void main(String[] args) throws Throwable {

		//		System.setProperty("webdriver.chrome.driver","D:\\basicselenium\\src\\main\\resources");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();

		/*	FileInputStream fis=new FileInputStream("./Filedata.properties");
		Properties pro=new Properties();
		pro.load(fis);
		String URL = pro.getProperty("url");
		  String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");


		driver.get(URL);
		//driver.get("http://demo.actitime.com/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.findElement(By.id("username")).sendKeys(USERNAME);
		driver.findElement(By.name("pwd")).sendKeys(PASSWORD);
		driver.findElement(By.id("loginButton")).click();*/

		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		FileInputStream fis=new FileInputStream("./Filedata.properties");
		Properties pro=new Properties();
		pro.load(fis);
		String URL = pro.getProperty("url1");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");
		
		driver.get(URL);
		LoginPage login =new LoginPage(driver);
		login.loginToApp(USERNAME, PASSWORD);

		//driver.close();
		//driver.quit();

	}

}
