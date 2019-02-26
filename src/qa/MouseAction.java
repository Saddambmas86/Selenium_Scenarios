package qa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MouseAction {
	
public static void main(String...s){
	
	
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shusain\\Desktop\\JS\\Selenium\\Selenium Setup\\geckodriver-v0.18.0-win32\\geckodriver.exe");	
WebDriver driver= new FirefoxDriver();
String baseUrl="http://www.facebook.com/";

driver.get(baseUrl);
WebElement txtUsername = driver.findElement(By.id("email"));

Actions builder = new Actions(driver);
Action seriesOfActions = builder
	.moveToElement(txtUsername)
	.click()
	.keyDown(txtUsername, Keys.SHIFT)
	.sendKeys(txtUsername, "hello")
	.keyUp(txtUsername, Keys.SHIFT)
	.doubleClick(txtUsername)
	.contextClick()
	.build();
	
seriesOfActions.perform() ;
	
}
	

}
