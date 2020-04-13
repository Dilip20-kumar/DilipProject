import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test7 
{
	public static void main(String[] args) throws InterruptedException 
	{
	
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\workspace\\Selenium practice\\server\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://www.facebook.com/");
WebElement w2=driver.findElement(By.id("email"));
w2.sendKeys("dilip");
Thread.sleep(2000);
w2.sendKeys(Keys.chord(Keys.CONTROL+"a"));
w2.sendKeys(Keys.chord(Keys.CONTROL+"x"));
WebElement w1=driver.findElement(By.xpath("//input[@name='firstname']"));
w1.sendKeys(Keys.chord(Keys.CONTROL+"v"));
	}

}
