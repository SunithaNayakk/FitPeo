package Task_Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Test_Class {
    public static String exectedHomePageTitle = "Remote Patient Monitoring (RPM) - fitpeo.com";
    public static int sliderBtnLocBeforeScroll = 0;
    public static int sliderBtnLocAfterScroll = 0;

    public static void main(String[] args) throws InterruptedException {

        // TODO Auto-generated method stub
        WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

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

        WebElement sliderBar = driver.findElement(By.xpath("//span[contains(@class,'MuiSlider-rail')]"));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(sliderBar));
        WebElement sliderBtn = driver.findElement(By.xpath("//span[contains(@class,'MuiSlider-thumb')]"));
        wait.until(ExpectedConditions.visibilityOf(sliderBtn));
        WebElement numberInputTextField = driver.findElement(By.xpath("//input[@type='number']"));

        Actions actions = new Actions(driver);
        //Adjust the Slider:
        if (numberInputTextField.isDisplayed()) {
            System.out.println("inside if block");
            sliderBtnLocBeforeScroll = sliderBtn.getLocation().getX();
            System.out.println("Location of the Slider Button Before Dragging is: " + sliderBtnLocBeforeScroll);

            int sliderWidth = sliderBar.getSize().getWidth();
            int targetValue = 820;
            double pixelPerValue = (double) sliderWidth / 2000;  // Pixel per value
            int offset = (int) ((targetValue * pixelPerValue)-149);

            actions.moveToElement(sliderBar).clickAndHold(sliderBtn).dragAndDropBy(sliderBar,offset,0).build().perform();
            sliderBtnLocAfterScroll = sliderBtn.getLocation().getX();
            System.out.println("Location of the Slider Button After Dragging is: " + sliderBtnLocAfterScroll);
        }

        //Validate Slider Value:
        try {
            Assert.assertNotEquals(sliderBtnLocBeforeScroll, sliderBtnLocAfterScroll);
        } catch (Exception e) {
            System.out.println("Scroll Button isn't moved");
        }
        //Update the Text Field:
        numberInputTextField.click();
        numberInputTextField.sendKeys(Keys.CONTROL+"a");
        numberInputTextField.sendKeys(Keys.BACK_SPACE);
        numberInputTextField.sendKeys("560");

        //Select CPT Codes:
        List<WebElement> cPTCodesCheckBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
            for (int i = 0; i < cPTCodesCheckBoxes.size()-8; i++) {
                cPTCodesCheckBoxes.get(i).click();
            }
        String reimbursementPerMonth = "Total Recurring";
        WebElement reimbursementHeader = driver.findElement(By.xpath("//div[contains(@class,'MuiToolbar-root MuiToolbar-gutters')]/p[contains(.,'" + reimbursementPerMonth + "')]/p"));
        String reimbursementText = reimbursementHeader.getText();
        if (reimbursementText.contains("$95760")) {
            System.out.println("Total Recurring Reimbursement validated: $95760");
        } else {
            System.out.println("Reimbursement validation failed");
        }
        driver.quit();
    }
}