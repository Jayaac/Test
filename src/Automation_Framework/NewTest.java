package Automation_Framework;

import java.io.File;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class NewTest {
  @Test
  @Parameters({"browser"})
  public void f(String browser) throws Exception {
	  
	  WebDriver driver=null;
	  
	  if(browser.equalsIgnoreCase("chrome"))
	  {
	  System.setProperty("webdriver.chrome.driver","//home//jchandel004//Downloads//chromedriver");
	  
	 driver=new ChromeDriver();
	               
	  }
	  
	  else if(browser.equalsIgnoreCase("Firefox"))
	  {
		  System.setProperty("webdriver.firefox.marionette","//home//jchandel004//Downloads//geckodriver");		 
      File pathToBinary = new File("//home//jchandel004//Downloads//firefox//firefox");
      FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
      FirefoxProfile firefoxProfile = new FirefoxProfile();       
       driver = new FirefoxDriver(ffBinary,firefoxProfile);
		 }
		  
	 
	  driver.get("http://test1.absofttrainings.com/");
	  Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='menu-item-163']/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//*[@id='menu-item-162']/a")).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath("//button[contains(@id,'alert')]")).click();
	Thread.sleep(2000);
	Alert alert=driver.switchTo().alert();
	alert.accept();
	driver.close();
  }
}
