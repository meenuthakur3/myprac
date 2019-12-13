package Action_class;

import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class action_class
{
	public static void main(String[] args) 
	{  
		// non modifier key
		System.setProperty("webdriver.chrome.driver","D:\\java clsses\\selenium jar files\\chromedriver_win32\\chromedriver.exe");
	    ChromeDriver  driver=new ChromeDriver();
	    driver.get("https://www.facebook.com");  
	    driver.manage().window().maximize();
	    Actions as=new Actions(driver);
	    as.sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("meenu").perform();
		
	}

}
