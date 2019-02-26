package qa;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrintDynamicValueInArray{
public static void main(String...s){

System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shusain\\Desktop\\JS\\Selenium\\Selenium Setup\\geckodriver-v0.18.0-win32\\geckodriver.exe");	

WebDriver driver= new FirefoxDriver();
driver.get("http://toolsqa.com/automation-practice-table");
//Row
//String SValue=driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr["+i+"]/th")).getText();	
//Column
//String AllValues=driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
WebElement table=driver.findElement(By.id("content"));
//List<WebElement> rows = table.findElements(By.tagName("tr"));
List<WebElement> column = table.findElements(By.tagName("td"));
List<String> value = new ArrayList<String>();

System.out.println(column.size());

for (int j=0; j<column.size(); j++){
    System.out.println(column.get(j).getText());
    value.add(column.get(j).getText());
}

System.out.println(value);


}}


