package qa;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Function;

public class Waits {

public static void main(String...s) throws InterruptedException{

System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shusain\\Desktop\\JS\\Selenium\\Selenium Setup\\geckodriver-v0.18.0-win32\\geckodriver.exe");

WebDriver driver=new FirefoxDriver();


//===Explicit Wait===
driver.get("http://demo.guru99.com/test/upload/");
WebDriverWait wait= new WebDriverWait(driver,20);
WebElement T1=wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("uploadfile_0")));
T1.sendKeys("C:\\Users\\Shusain\\Desktop\\QAText.txt");
driver.findElement(By.id("terms")).click();
driver.findElement(By.id("submitbutton")).click();
		
	
/* 
===implicit wait====
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("http://demo.guru99.com/test/upload/");
driver.findElement(By.id("uploadfile_0")).sendKeys("C:\\Users\\Shusain\\Desktop\\QAText.txt");
driver.findElement(By.id("terms")).click();
driver.findElement(By.id("submitbutton")).click();
*/		


driver.get("https://www.google.com/");
driver.findElement(By.name("q")).sendKeys("Wikipedia");
Thread.sleep(4000);
driver.findElement(By.xpath("//*[@value='Googsddsle Search'][1]")).click();

//FluentWait

Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
.withTimeout(20, TimeUnit.SECONDS)
.pollingEvery(5, TimeUnit.SECONDS)
.ignoring(NoSuchElementException.class);

WebElement Element=wait.until(new Function<WebDriver, WebElement>(){
	public WebElement apply(WebDriver driver){
		return driver.findElement(By.xpath("//*[@value='Googsddsle Search'][1]"));
	}
});




			
}}
