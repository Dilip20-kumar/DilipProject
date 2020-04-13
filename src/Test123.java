import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.WebElementHandler;

public class Test123 
{

	public static void main(String[] args) 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\workspace\\Selenium practice\\server\\chromedriver.exe");
	     WebDriver driver=new ChromeDriver();
	     driver.get("https://www.jdwilliams.co.uk/");
	     WebElement searchTxtBox=driver.findElement(By.id("searchKeyWords2")); 
	     searchTxtBox.sendKeys("jeans");
	     searchTxtBox.click();
	     searchTxtBox.sendKeys("jeans");
	    
		WebElement searchBtn=(WebElement) driver.findElement(By.id("searchButton"));
	     boolean b1=((WebElement) searchBtn).isDisplayed();
	     if(b1)
	     {
	     boolean b2= ((WebElement) searchBtn).isEnabled();
	      if(b2)
	     {
	    	 ((WebElement) searchBtn).click();
	     }  		 
	}
	     driver.navigate().to("https://www.jdwilliams.co.uk/shop/signin/display.action");
	     WebElement rememberCheckBox=driver.findElement(By.name("remember"));
	     boolean b3= rememberCheckBox.isSelected();
	     if(b3)
	     {
	    	   System.out.println("remember check box is checked");
	     }
	     else
	     {
	    	 System.out.println("remember check box is not checked"); 
	     }
	     rememberCheckBox.clear();
	     System.out.println(rememberCheckBox.isSelected());
	    	 
	     }

}
