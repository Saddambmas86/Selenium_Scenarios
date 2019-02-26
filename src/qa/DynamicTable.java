package qa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DynamicTable{
	
public static void main(String...s){

System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shusain\\Desktop\\JS\\Selenium\\Selenium Setup\\geckodriver-v0.18.0-win32\\geckodriver.exe");	

WebDriver driver= new FirefoxDriver();
driver.get("http://toolsqa.wpengine.com/automation-practice-table");

String Column1Value="Clock Tower Hotel";
for(int i=1;i<=5;i++){

String SValue=driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr["+i+"]/th")).getText();	
	
if(SValue.equalsIgnoreCase(Column1Value)){
for(int j=1;j<=5;j++){
String AllValues=driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr["+i+"]/td["+j+"]")).getText();

System.out.println(AllValues);
System.out.println();
	
	}}
}





		
}
}
		