package BasePackage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utility.TimeUtils;

public class Baseclass {
	  
	public static Properties prop =new  Properties();
	
	public	static WebDriver driver;
	public static  WebDriverWait wait;
	public static Select obj;
	
public Baseclass() {
	try {
	FileInputStream file= new FileInputStream("C:\\Users\\jeets\\eclipse-workspace\\Amazonwebsite\\src\\test\\java\\environmentvariables\\config.properties");
	prop.load(file);
}
	catch(FileNotFoundException e) {
		e.printStackTrace();
	}
	catch(IOException a) {
		a.printStackTrace();
		}}
public  void initiate() {
String browsername=	prop.getProperty("browser");
if(browsername.equals("chrome")) {
	System.setProperty("webdriver.chrome.driver","chromedriver-win32\\chromedriver.exe");
	 driver=new ChromeDriver();}
else if(browsername.equals("Firefox")) {
	System.setProperty("webdriver.gecko.driver","geckodriver.exe");
	 driver=new FirefoxDriver();}
wait=new WebDriverWait(driver,Duration.ofSeconds(TimeUtils.timepage));

driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TimeUtils.
			  timepage));
		driver.get(prop.getProperty("url"));
  }
 
 }


  
 
	
 
    



