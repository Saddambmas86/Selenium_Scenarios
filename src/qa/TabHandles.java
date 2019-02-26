package qa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabHandles {
	
public static void main(String...s) throws Exception{

System.setProperty("webdriver.chrome.driver","C://Users//Shusain//Desktop//JS//Selenium//Selenium Setup//chromedriver_win32//chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("http://toolsqa.com/automation-practice-switch-windows/");

String Parent=driver.getWindowHandle();
System.out.println("Parent Window ID is "+Parent);

driver.findElement(By.xpath("html/body/div[1]/div[5]/div[2]/div/div/p[4]/button")).click();


Set<String> AllWindows=driver.getWindowHandles();

/*
driver.switchTo().window(Tabs.get(1));
String Tab1=driver.getTitle();
System.out.println("Title for 1st= "+Tab1);
driver.switchTo().window(Tabs.get(2));
String Tab2=driver.getTitle();
System.out.println("Title for 2nd Tab= "+Tab2);

driver.switchTo().window(Tabs.get(0));
String Tab3=driver.getTitle();
System.out.println("Title for Main Tab= "+Tab2)*/

Iterator<String> ITR=AllWindows.iterator();

String Main=ITR.next();
String Child1=ITR.next();
//String Child2=ITR.next();

driver.switchTo().window(Child1);
System.out.println("Let See");
System.out.println(driver.getTitle());
driver.close();

			
}
				

}
