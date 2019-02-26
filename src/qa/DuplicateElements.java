package qa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DuplicateElements {
	
public static void main(String...s){

System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shusain\\Desktop\\JS\\Selenium\\Selenium Setup\\geckodriver-v0.18.0-win32\\geckodriver.exe");	

WebDriver driver= new FirefoxDriver();
driver.get("http://toolsqa.com/automation-practice-form/");
System.out.println("Link Open successfully");

List<WebElement> E=driver.findElements(By.name("sex"));	

for(int i=0;i<E.size();i++){	
WebElement E2=E.get(i);
String Value=E2.getAttribute("value");
System.out.println("Values from Radio Button= "+Value);

if(Value.equalsIgnoreCase("male")){
	E2.click();
	break;
}

}






	
}
	

}
