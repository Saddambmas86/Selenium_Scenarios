package qa;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazonBat {

public static void main(String...s) throws InterruptedException{	
	
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shusain\\Desktop\\JS\\Selenium\\Selenium Setup\\geckodriver-v0.18.0-win32\\geckodriver.exe");	
WebDriver driver= new FirefoxDriver();			

String SearchItem="CricketBat";

driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
driver.get("https://www.amazon.in/");

driver.findElement(By.id("twotabsearchtextbox")).sendKeys(SearchItem);
driver.findElement(By.xpath("(//*[@class='nav-input'])[1]")).click();

List <WebElement> L1=driver.findElements(By.xpath("(//img[@class='s-access-image cfMarker'])"));

int num=L1.size();
System.out.println("Number of Items appearing are "+num);

int item=3;


if(num>0 && item<=num && item>0){
driver.findElement(By.xpath("(//img[@class='s-access-image cfMarker'])["+item+"]")).click();
Thread.sleep(3000);
System.out.println("bat Selected");
}
else{
	System.out.println("Entered Item is not available on Page");
}

}
}
