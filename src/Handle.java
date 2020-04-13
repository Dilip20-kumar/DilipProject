import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\workspace\\Selenium practice\\server\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com/");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		String mainWinId=driver.getWindowHandle();
		 Set<String> all= driver.getWindowHandles();
		Iterator<String>itr=all.iterator();
		
		  while(itr.hasNext());
		{
		 String winId=itr.next();
		 if(mainWinId.equals(winId))
		 {
			 driver.switchTo().window(winId);
			 driver.close();
		 }
			
		} 
		

	}

	
		
	}

	
	


