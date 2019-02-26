package qa;

import java.io.File;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.apache.http.HttpConnection;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Pract {
	
	
public static void main(String...s) throws Exception{

	System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shusain\\Desktop\\JS\\Selenium\\Selenium Setup\\geckodriver-v0.18.0-win32\\geckodriver.exe");	
	WebDriver driver= new FirefoxDriver();		
	
	driver = new FirefoxDriver();
	 
    driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    driver.get("https://www.flipkart.com/");
    WebElement headerelement = driver.findElement(By.linkText("ELECTRONICS"));
      Actions builder = new Actions(driver);
      Action mouseoverevent = builder.moveToElement(headerelement).build();
      mouseoverevent.perform();

}
	
	

}
