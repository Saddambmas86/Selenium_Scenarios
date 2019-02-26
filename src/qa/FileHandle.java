package qa;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FileHandle {

WebDriver driver;
File Folder;
	

//System.setProperty("webdriver.chrome.driver", "C:/Users/Shusain/Desktop/JS/Selenium/Selenium Setup/chromedriver_win32/chromedriver.exe");	
//driver= new ChromeDriver();	

@BeforeMethod	
public void setup(){
Folder=new File("New Folder QA");
Folder.mkdir(); //It is used to make sure folder is created or not.

//Chrome Properties:
System.setProperty("webdriver.chrome.driver", "C:/Users/Shusain/Desktop/JS/Selenium/Selenium Setup/chromedriver_win32/chromedriver.exe");	
ChromeOptions options=new ChromeOptions();

//ChromeOptions--class
//profile.default_content_settings.popups
//download.default_directory
//setExperimentalOption
//DesiredCapabilities
//setCapability


//Create map to set the entry and pass:
Map<String, Object>pref=new HashMap<>();
pref.put("profile.default_content_settings.popups", 0); //Used to disable the popup window
pref.put("download.default_directory", Folder.getAbsolutePath()); //Used to set the location for download file
options.setExperimentalOption("prefs", pref);
DesiredCapabilities cap=DesiredCapabilities.chrome(); //Used to set the capability, pass the above map
cap.setCapability(ChromeOptions.CAPABILITY, options);
driver=new ChromeDriver(cap);
}



@Test
public void downloadFile() throws Exception{
//driver.get("http://the-internet.herokuapp.com/download");
//driver.findElement(By.xpath("(//a[contains(@href,'.txt')])[2]")).click();

driver.get("http://templatelab.com/training-manual/");
driver.findElement(By.xpath("(//a[@class='wpdm-download-link'])[1]")).click();
Thread.sleep(3000);

Thread.sleep(3000);

//Make sure the directory is not empty
 Assert.assertTrue(Folder.listFiles().length>0);

//Make sure downloaded file is not empty:
for(File file:Folder.listFiles()){
	Assert.assertTrue(file.length()>0);
}
}

//To delete the folder
public void teardown(){
driver.close();
for(File file: Folder.listFiles()){
file.delete();	
}

Folder.delete();

}


	

}
