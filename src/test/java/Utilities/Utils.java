package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import Steps.Hooks;

public class Utils {

	private static WebDriver driver = Hooks.driver;
	private static WebDriverWait wait = new WebDriverWait(driver, 60);
	
	public void writeText(By element, String text) {
		
		WaitUntilElementVisible(element);
		driver.findElement(element).sendKeys(text);
	}
	
	public void selectComboOption(By element, String option) {
		
		WaitUntilElementVisible(element);
		Select combo = new Select(driver.findElement(element));
		combo.selectByVisibleText(option);
	}
	
	public void clickElement(By element) {
		
		WaitUntilElementVisible(element);
		driver.findElement(element).click();
	}
		
    protected void WaitUntilElementVisible(By element) {
    	
        wait.until(ExpectedConditions.presenceOfElementLocated(element));
    }
}


