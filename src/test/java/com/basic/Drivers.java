package com.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.opera.OperaDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Drivers {

	public static void main(String[] args) {

		//		WebDriver driver = new EdgeDriver();
		//		//driver.manage().window().maximize();
		//		driver.get("https://www.flipkart.com/");

		//pre conditions

		//launch the browser
		//		System.setProperty("webdriver.msedge.driver","D:\\selinum\\msedgedriver.exe");
		//launch the browser
		//	WebDriverManager.firefoxdriver().setup();

		//launching the flipkart through firefox driver
		//	WebDriver suni = new FirefoxDriver();
		//suni.manage().window().maximize();
		//suni.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//String url ="https://www.amazon.com/s?k=Dresses";
		//suni.get(url);

		//launching the flipkart through EDGE driver
		//WebDriverManager.edgedriver().setup();
		//WebDriver driver= new EdgeDriver();
		//driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//String url= "https://www.amazon.com/s?k=shoes";
		//driver.get(url);

		//launching the flipkart through chrome driver
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		String url= "https://www.amazon.com/s?k=bags";
		driver.get(url);

    
		//post condition
			driver.quit();

	}

} 
