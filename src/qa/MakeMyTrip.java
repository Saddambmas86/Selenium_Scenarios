package qa;

import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MakeMyTrip {
	
public static void main(String...s) throws InterruptedException{

System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shusain\\Desktop\\JS\\Selenium\\Selenium Setup\\geckodriver-v0.18.0-win32\\geckodriver.exe");	
WebDriver driver= new FirefoxDriver();		

String Source="Delhi";
String Destination="Etawah";
String Date="14 Jan, Mon";

driver.get("https://www.makemytrip.com/bus-tickets/");
driver.findElement(By.id("hp-widget__sfrom")).sendKeys(Source);
driver.findElement(By.id("hp-widget__sTo")).sendKeys(Destination);
driver.findElement(By.id("hp-widget__depart")).sendKeys(Date);
Thread.sleep(2000);
driver.findElement(By.id("searchBtn")).click();	
Thread.sleep(3000);
System.out.println("Click the 2nd bus");
driver.findElement(By.xpath("(//a[@id='seatmap_btn_0'])[2]")).click();

List <WebElement> E1=driver.findElements(By.id("seatmap_btn_0"));


//To print details of particular bus:
int Num=E1.size();
int FlightNum=30;

if(Num>0 && FlightNum>0 && FlightNum<=Num){
System.out.println("Click on FlightNum: "+FlightNum);
Thread.sleep(5000);
driver.findElement(By.xpath("(//a[@id='seatmap_btn_0'])["+FlightNum+"]")).click();	
}
else{
	System.out.println("No bus available at the "+ FlightNum +" number");
}


//To get the details for random bus
/*
Random Rand=new Random();
for(int i=0;i<20;i++){
int BusNum=1+Rand.nextInt(10);	
System.out.println("Value of i is: "+BusNum);
}*/


}

}
