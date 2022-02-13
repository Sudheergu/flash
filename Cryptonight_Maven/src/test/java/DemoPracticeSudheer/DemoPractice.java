package DemoPracticeSudheer;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoPractice 
{
	public WebDriver driver;
	String browser = "Chrome";
	
	public DemoPractice()
	{
		//WebDriverManager.chromedriver().setup();
		if(browser.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Eclipse workspace (java jar file & Selenium)\\chromedriver_win32\\chromedriver.exe");
			 driver = new ChromeDriver();
		}
		else if (browser.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Eclipse workspace (java jar file & Selenium)\\geckodriver-v0.30.0-win64\\geckodriver.exe");
			 driver = new FirefoxDriver();
		}
	}
	@Before
	public void launchApplication()
	{
		System.out.println("Test Case : launchApplication");
		driver.get("https://www.saucedemo.com/");
	}
	@Test
	public void loginToApplication() throws InterruptedException
	{
		//launchApplication();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id ='user-name']")).sendKeys("sudhirgupta53412@gmail.com");
		driver.findElement(By.xpath("//input[@id ='password']")).sendKeys("Sudhir2345@");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}
}
