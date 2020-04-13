import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo8 
{
    public static WebDriver driver;
	public static void main(String[] args)throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\workspace\\Selenium practice\\server\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		 driver.get("http.makeMyTrip.com");
		WebElement depart=driver.findElement(By.xpath("//span[contains(text(),'DEPARTURE')]"));
		depart.click();
		Thread.sleep(2000);
		datePicker("2020","April","20");
	}
	public static void datePicker(String year, String month, String date) 
	{
	WebElement date1=driver.findElement(By.xpath("(//div[text()='+month+"+year+"']//following::p[text()='"+date+"'])[1]"));
	date1.click();
		
	}
	
	}


