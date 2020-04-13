package dilip;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test5
{

	public static void main(String[] args) 
	{
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\workspace\\Selenium practice\\server\\chromedriver.exe");
		 WebDriver driver=new ChromeDriver();
		 driver.get("https://www.jdwilliams.co.uk/");
		 driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		 WebElement newInWebElm=driver.findElement(By.xpath("//a[@id='topNav_NewIn']"));
		 Actions act=new Actions(driver);
		 act.moveToElement(newInWebElm).perform();
		 WebElement homeLnk=driver.findElement(By.xpath("//a[@id='DDM_pro__Home']"));
		 homeLnk.click();
		 Actions act1=new Actions(driver);
		 act1.doubleClick(homeLnk).perform();
		 Actions act2=new Actions(driver);
		 act2.contextClick(homeLnk);
			
		 
	}
}

		
	
	


