package dilip;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
class Alert 
{

	public static void main(String[] args) 
	{

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\workspace\\Selenium practice\\server\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/delete-customer.php");
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		WebElement submitbtn=driver.findElement(By.xpath("//input[@name='submit']"));
		submitbtn.click();
       String expectedAlertText="Do you realy want to delete this customer";
       try
       {
    	  org.openqa.selenium.Alert alt= driver.switchTo().alert();
    	  
    	 String actualAlertText=alt.getText();
    	 if(expectedAlertText.equals(actualAlertText))
    	 {
    		 alt.accept();
    		 alt.accept();
    	 }
    	   
       }
         catch(Exception e)
       {
    	   e.printStackTrace();
    	   
       }
	}

}
