package qa;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Window1 {

public static void main(String...s) throws Exception{

System.setProperty("webdriver.chrome.driver","C://Users//Shusain//Desktop//JS//Selenium//Selenium Setup//chromedriver_win32//chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("http://toolsqa.com/automation-practice-switch-windows/");

String Parent=driver.getWindowHandle();
System.out.println("Parent Window ID is "+Parent);

driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div/div/p[4]/button")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div/div/p[3]/button")).click();

Set<String> AllWindow=driver.getWindowHandles();
int count=AllWindow.size();
System.out.println("Number of window "+count);


Iterator<String> ITR=AllWindow.iterator();

String Main=ITR.next();
String Child1=ITR.next();
String Child2=ITR.next();

driver.switchTo().window(Child1);
System.out.println("Let See");
System.out.println(driver.getTitle());
driver.close();

driver.switchTo().window(Child2);
System.out.println("CHild 2");








	
}
	
	
	
}
