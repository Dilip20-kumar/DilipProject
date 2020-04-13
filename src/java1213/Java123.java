package java1213;

import javax.swing.Spring;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Java123 
{

	public static void main(String[] args) 
	{
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\workspace\\Selenium practice\\server\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
     driver.get("https://www.jdwilliams.co.uk/");
     String expectedTitle="Women's Fashion in Plus Size, menswear, furniture, homewares and electricals";
     String actualTitle=driver.getTitle();
     if(actualTitle.equals(expectedTitle))
     {
    	 System.out.println("we are in home page");
     }
     else
     {
    	 System.out.println("we are in not home page");
     }
     WebElement searchTxtBox=driver.findElement(By.name("searching"));
       searchTxtBox.sendKeys("jeans");
       WebElement searchBtn=driver.findElement(By.id("searchButton")); 
       searchBtn.click();
       String url=driver.getCurrentUrl();
       if(url.contains("jeans"))
       {
    	   System.out.println("we are in plp page");
       }
       else
       {
    	   System.out.println("we are in not plp page");
       }
       String pagesource=driver.getPageSource();
       System.out.println(pagesource);
       driver.navigate().to("https//facebook.com");
       driver.navigate().back();
       driver.navigate().forward();
       driver.navigate().refresh();
	}
}
       
       
	


