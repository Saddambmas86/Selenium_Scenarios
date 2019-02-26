package qa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class HandleCertificate {
 
public static void main(String...s) throws Exception{

DesiredCapabilities Cap=new DesiredCapabilities();
Cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);	
	
System.setProperty("webdriver.chrome.driver","C://Users//Shusain//Desktop//JS//Selenium//Selenium Setup//chromedriver_win32//chromedriver.exe");

WebDriver driver= new ChromeDriver();
driver.get("https://cacert.org/");	




	
	
}
	
}
