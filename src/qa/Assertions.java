package qa;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;


public class Assertions {

public static WebDriver driver;	
	
/*@Test	
public void InitiateBrowser(){
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shusain\\Desktop\\JS\\Selenium\\Selenium Setup\\geckodriver-v0.18.0-win32\\geckodriver.exe");	
WebDriver driver = new FirefoxDriver();
String ExpTitle="google";
driver.get("https://www.google.com/");
String ActTitle=driver.getTitle();
}*/
//Hard Assertions:
//Assert.assertEquals(ActTitle, ExpTitle);//--Test passed when exact content match and not the reference.
//Assert.assertNotEquals(ActTitle, ExpTitle);--Test Passed when not match.
//Assert.assertFalse(2<3);--Test passed when condition false i.e. if 2>3
//Assert.assertTrue(2>1, "True Condition");----Test passed when condition true i.e. if 2<3
//Assert.assertSame(ActTitle, ExpTitle);----It  match the reference.
//Assert.assertNull(ActTitle);--Passed if object is null
//Assert.assertNotNull(ActTitle);--Passes if object is not null.
//String A=new String("Saddam");
//String B=new String("Saddam");
//Assert.assertEquals(A, B);

//SoftAssertion:
//SoftAssert Class



@Test	
public void InitiateBrowser1(){
SoftAssert T1=new SoftAssert();	
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shusain\\Desktop\\JS\\Selenium\\Selenium Setup\\geckodriver-v0.18.0-win32\\geckodriver.exe");	
WebDriver driver = new FirefoxDriver();
String ExpTitle="google";
String ExpURL="https://www.google.com/";
driver.get(ExpURL);
String ActURL="https://www.google.com/";
String ActTitle=driver.getTitle();
String CurrentURL=driver.getCurrentUrl();
T1.assertEquals(ActTitle.toLowerCase(), ExpTitle.toLowerCase());//----It match the reference
System.out.println("After failed statement");
T1.assertEquals(ActURL.toLowerCase(), ExpURL.toLowerCase());
T1.assertAll();
}





	
}
