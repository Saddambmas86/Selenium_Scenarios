package qa;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Handlingtdtr {
	
public static void main(String...s) throws Exception{
	
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shusain\\Desktop\\JS\\Selenium\\Selenium Setup\\geckodriver-v0.18.0-win32\\geckodriver.exe");	
WebDriver driver= new FirefoxDriver();	

driver.get("https://www.toolsqa.com/automation-practice-table/");
WebElement table=driver.findElement(By.id("content"));
WebElement table2=driver.findElement(By.xpath("//table[@class='tsc_table_s13']"));
List<WebElement> rows = table2.findElements(By.tagName("tr"));
List<WebElement> column = table2.findElements(By.tagName("td"));

System.out.println("Number of rows :"+rows.size());
System.out.println("Number of Columns: "+column.size());

int RowNum=2;
int colNum=6;


if(RowNum<=rows.size() && colNum<=column.size() ){
	
driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr["+RowNum+"]/td["+colNum+"]")).click();
System.out.println("Wait start");
Thread.sleep(3000);
System.out.println("click successful");
	
}





}
	
	

}
