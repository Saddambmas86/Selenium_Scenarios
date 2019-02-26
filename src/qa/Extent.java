package qa;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Extent {
	public static WebDriver driver;
	static ExtentTest testlog;
public static void main(String...s) throws Exception{	
	
	
	ExtentHtmlReporter htmlreport = new ExtentHtmlReporter(".\\Report\\Extent Report with Screenshot.html");
	ExtentReports reports = new ExtentReports();
	reports.attachReporter(htmlreport);
	

	//Capture and save screenshot
	File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	BufferedImage img = ImageIO.read(screen);
	File filetest = Paths.get(".").toAbsolutePath().normalize().toFile();
	ImageIO.write(img, "png", new File(filetest + "\\Screenshots\\" + "Test.png"));

	//Log Screenshot in Report
	testlog.info("Details of " + "Test screenshot", MediaEntityBuilder
	                .createScreenCaptureFromPath(System.getProperty("user.dir") + "\\Screenshots\\" + "Test.png").build());

	//Flush Report-Mandatory, Else report will not generate.  
	reports.flush();


}}
