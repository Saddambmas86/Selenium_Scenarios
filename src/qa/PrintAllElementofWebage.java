package qa;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintAllElementofWebage {
	
public static void main(String...s){

System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shusain\\Desktop\\JS\\Selenium\\Selenium Setup\\geckodriver-v0.18.0-win32\\geckodriver.exe");	

WebDriver driver= new FirefoxDriver();
driver.get("http://toolsqa.com/automation-practice-table");

List<WebElement> AllIds=driver.findElements(By.xpath("//*[@id]"));
List<String>PrintIds=new ArrayList<>();

//Set<WebElement> AllIds=(Set<WebElement>) driver.findElements(By.xpath("//*[@id]"));


Iterator itr=AllIds.iterator();

while(itr.hasNext()){

WebElement E1=(WebElement) itr.next();	
System.out.println(E1.getAttribute("id"));
System.out.println("=================================");
System.out.println("All ids are: ");
PrintIds.add(E1.getAttribute("id"));
}

System.out.println(PrintIds);
				
		}	

}
