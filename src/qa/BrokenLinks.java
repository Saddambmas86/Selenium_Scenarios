package qa;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLinks {
	
public static void verifyLinks(String LinkURL) throws IOException{
try{
	
URL url=new URL(LinkURL);	
HttpURLConnection Connection=(HttpURLConnection)url.openConnection();
Connection.setConnectTimeout(3000);
Connection.connect();

if(Connection.getResponseCode()==200){
	System.out.println(LinkURL+" = "+Connection.getResponseMessage());
}
if(Connection.getResponseCode()==Connection.HTTP_NOT_FOUND){
System.out.println(LinkURL +"=" +Connection.getResponseMessage());	
}

}
catch(Exception e){
	
}

}
	

public static void main(String...s) throws Exception{	
	
System.setProperty("webdriver.chrome.driver","C://Users//Shusain//Desktop//JS//Selenium//Selenium Setup//chromedriver_win32//chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("http://demo.guru99.com/test/newtours/");
List <WebElement> list=driver.findElements(By.tagName("a"));
System.out.println("Total number of links are: "+list.size());


Iterator itr=list.iterator();

while(itr.hasNext()){
WebElement E=(WebElement)itr.next();	
String URL=E.getAttribute("href");
BrokenLinks.verifyLinks(URL);
}





}
	
}
