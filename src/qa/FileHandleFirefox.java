 package qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

public class FileHandleFirefox {
	
public static void main(String...s) throws InterruptedException{
	
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shusain\\Desktop\\JS\\Selenium\\Selenium Setup\\geckodriver-v0.18.0-win32\\geckodriver.exe");	
FirefoxProfile myProfile=new FirefoxProfile();

myProfile.setPreference("browser.download.dir", "C:/Users/Shusain/Desktop/JS/Selenium/Selenium_Scenarios/New Folder QA");
myProfile.setPreference("browser.download.folderList", 2);
myProfile.setPreference("browser.download.manager.showWhenStarting", false);
myProfile.setPreference("browser.helperApps.neverAsk.saveToDisk", "text/plain");

//0: Save file in users desktop
//1: Save the file in download
//2: Save at specified location


//text/html
//application/msword
//application/pdf
//application/vnd.ms-excel

//FirefoxOptions options = new FirefoxOptions();
//options.setProfile(myProfile);
WebDriver driver=new FirefoxDriver(myProfile);
driver.get("http://demo.automationtesting.in/FileDownload.html");
driver.findElement(By.id("textbox")).sendKeys("QA Saddam");
driver.findElement(By.id("createTxt")).click();
Thread.sleep(2000);
driver.findElement(By.id("link-to-download")).click();
/*
	 FirefoxProfile profile = new FirefoxProfile();
	 
	 //Set Location to store files after downloading.
	 profile.setPreference("browser.download.dir", "./New Folder QA");
	 profile.setPreference("browser.download.folderList", 2);
	 
	 //Set Preference to not show file download confirmation dialogue using MIME types Of different file extension types.
	 profile.setPreference("browser.helperApps.neverAsk.saveToDisk", 
	     "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet;"); 
	 
	 profile.setPreference( "browser.download.manager.showWhenStarting", false );
	 profile.setPreference( "pdfjs.disabled", true );
	 
	 //Pass FProfile parameter In webdriver to use preferences to download file.
	 System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shusain\\Desktop\\JS\\Selenium\\Selenium Setup\\geckodriver-v0.18.0-win32\\geckodriver.exe");	
	 FirefoxDriver driver = new FirefoxDriver(profile);  
	 
	 // Open APP to download application
	 driver.get("http://toolsqa.com/automation-practice-form/");
	 
	 // Click to download 
	 driver.findElement(By.linkText("Test File to Download")).click();
	 
	 //Halting the execution for 5 secs to donwload the file completely
	 Thread.sleep(5000);
	 
	 driver.close();	
*/	
	
	
}

}
