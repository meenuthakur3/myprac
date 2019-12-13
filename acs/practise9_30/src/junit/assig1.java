package junit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class assig1
{ ChromeDriver driver;

	@Before
	public void fun1()
	{ 	  //browser launch +url hit 
		System.setProperty("webdriver.chrome.driver","D:\\java clsses\\selenium jar files\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
	}
	@After
	public void fun2() throws InterruptedException
	{    // browser close
		Thread.sleep(4000);
		 driver.close();
	}
	@Test
	public void fun3()
	{  
		       // facebook signup
			WebElement name=driver.findElement(By.cssSelector("input#u_0_m"));
			name.sendKeys("meenu");
			WebElement  sur=driver.findElement(By.cssSelector("input#u_0_o"));
			sur.sendKeys("thakur");
			WebElement  email=driver.findElement(By.cssSelector("input#u_0_r"));
			email.sendKeys("thakur@gmail.com");
			WebElement  reemail=driver.findElement(By.cssSelector("input#u_0_u"));
			reemail.sendKeys("thakur@gmail.com");
			WebElement  pass=driver.findElement(By.cssSelector("input#u_0_y"));
			pass.sendKeys("meenu123@");
			WebElement  day=driver.findElement(By.cssSelector("select#day"));
			assgn2.dropdownsel(day,4);
			WebElement month=driver.findElement(By.cssSelector("select#month"));		
			assgn2.dropdownsel(month,4);
			WebElement year=driver.findElement(By.cssSelector("select#year"));
			assgn2.dropdownsel1(year,"1992");
			WebElement check=driver.findElement(By.cssSelector("input#u_0_6"));
			check.click();
			WebElement sign=driver.findElement(By.name("websubmit"));
			sign.click();
	}
	public static void dropdownsel(WebElement web,int index)   // generic method 1
	{
		Select s1=new Select(web);
		s1.selectByIndex(index);
	}
	public static void dropdownsel1(WebElement web,String visibletext)  // generic method 2
	{
		Select s1=new Select(web);
		s1.selectByVisibleText(visibletext);
	}
}
