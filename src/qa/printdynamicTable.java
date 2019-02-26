package qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class printdynamicTable extends Extent{	

@BeforeMethod	
public void InitiateBrowser(){	
Test=Extent1.createTest("InitiateBrowser");

System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shusain\\Desktop\\JS\\Selenium\\Selenium Setup\\geckodriver-v0.18.0-win32\\geckodriver.exe");	
driver= new FirefoxDriver();
driver.get("http://toolsqa.com/automation-practice-table");
Test.info("Starting Browser");
if(driver.getCurrentUrl().equalsIgnoreCase("http://toolsqa.com/automation-practice-table")){
Test.pass("Browser open successfully");
}
else{
Test.fail("Browser opening having some error");	
}

}


@Test
public void Test11(){
for(int i=1;i<=5;i++){
String SValue=driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr["+i+"]/th")).getText();	
System.out.println("Headers are: "+SValue);
for(int j=1;j<=5;j++){
String AllValues=driver.findElement(By.xpath("//*[@id='content']/table/tbody/tr["+i+"]/td["+j+"]")).getText();
System.out.println("Columns are: "+ AllValues);
System.out.println();
}			
}}
}