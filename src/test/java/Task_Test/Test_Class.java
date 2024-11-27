package Task_Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_Class {
	public static String exectedHomePageTitle="Remote Patient Monitoring (RPM) - fitpeo.com";
	public static int sliderBtnLocBeforeScroll = 0;
	public static int sliderBtnLocAfterScroll = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
//		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.fitpeo.com/");
		String actualHomeageTitle = driver.getTitle();
		 try {
			Assert.assertEquals(actualHomeageTitle, exectedHomePageTitle);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("Home Pge Title isn't matched");
			e.printStackTrace();
		}
		
		WebElement revenueCalculator = driver.findElement(By.xpath("//a/div[contains(text(),'Revenue Calculator')]"));
		revenueCalculator.click();
		
		if (revenueCalculator.isSelected()) {
			System.out.println("User selected the Revenue Calvulator Module in HomaPage");
		}
		
		WebElement sliderBar = driver.findElement(By.xpath("//span[contains(@class,'MuiSlider-rail')]"));
		WebElement sliderBtn = driver.findElement(By.xpath("//span[contains(@class,'MuiSlider-thumb')]"));
		WebElement numberInputTextField = driver.findElement(By.xpath("//input[@type='number']"));

		Actions action=new Actions(driver);
		//Adjust the Slider:
		if(numberInputTextField.isDisplayed()) {			
			sliderBtnLocBeforeScroll = sliderBtn.getLocation().getX();
			System.out.println("Location of the Slider Button Before Dragging is: "+sliderBtnLocBeforeScroll);
			
			int indeXToMove=sliderBar.getLocation().getX();
			action.clickAndHold(sliderBtn).moveByOffset(indeXToMove%2, 0).pause(120).build().perform();
			sliderBtnLocAfterScroll = sliderBtn.getLocation().getX();
			System.out.println("Location of the Slider Button fter Dragging is: "+sliderBtnLocAfterScroll);
		}else {
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy()", 500);
			sliderBtnLocBeforeScroll = sliderBtn.getLocation().getX();
			System.out.println("Location of the Slider Button Before Dragging is: "+sliderBtnLocBeforeScroll);
			
			int indeXToMove=sliderBar.getLocation().getX();
			action.clickAndHold(sliderBtn).moveByOffset(indeXToMove%2, 0).pause(120).build().perform();
			sliderBtnLocAfterScroll = sliderBtn.getLocation().getX();
			System.out.println("Location of the Slider Button fter Dragging is: "+sliderBtnLocAfterScroll);
		}
		//Validate Slider Value:
		try {
			Assert.assertNotEquals(sliderBtnLocBeforeScroll, sliderBtnLocAfterScroll);
		} catch (Exception e) {
			System.out.println("Scroll Button isn't moved");
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Update the Text Field:
		numberInputTextField.click();
		numberInputTextField.clear();
		numberInputTextField.sendKeys("560");
		
		
		//Select CPT Codes:
		List<WebElement> CPTCodesChckBoxe = driver.findElements(By.xpath("//input[@type='checkbox']"));
		for (WebElement webElement : CPTCodesChckBoxe) {
			int i=0;
			if(i<4) {
				webElement.click();
				i++;
			}
		}
		String grossRevenue= "Total Recurring";
		String reimbursementPerMonth= "Total Recurring";
		String grossRevenueText = driver.findElement(By.xpath("//div[contains(@class,'MuiToolbar-root MuiToolbar-gutters')]/p[contains(.,'"+grossRevenue+"')]/p")).getText();
		if(grossRevenueText.equals("$1248927.57")) {
			System.out.println("Verified Gross Revenue....!");
		}
		
		String reimbursementPerMonthText=driver.findElement(By.xpath("//div[contains(@class,'MuiToolbar-root MuiToolbar-gutters')]/p[contains(.,'"+reimbursementPerMonth+"')]/p")).getText();
		if(reimbursementPerMonthText.equals("$103113")) {
			System.out.println("Verified Reimbursement Value....!");
		}
		driver.quit();
	}

}
