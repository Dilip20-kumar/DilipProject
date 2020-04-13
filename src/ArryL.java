import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ArryL {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\workspace\\Selenium practice\\server\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		String mainWinId=driver.getWindowHandle();
		String expectedTitle=" Jobs by Company";
		WebElement job=driver.findElement(By.xpath("//div[text()='Jobs']"));
				job.click();
				Set<String>allWinId=driver.getWindowHandles();
				Iterator<String>itr=allWinId.iterator();
				while(itr.hasNext())
				{
					String WinId=itr.next();
					driver.switchTo().window(WinId);
					String actualTitle=driver.getTitle();
					if(actualTitle.contains(expectedTitle))
					 {
					  WebElement	w1=driver.findElement(By.xpath("//div[text()='Recruiters']"));
					  w1.click();
						Thread.sleep(2000);
						driver.close();
						break;      
					  }
					}
				driver.switchTo().window(mainWinId);
				}
	}

						
				
				
				

		
