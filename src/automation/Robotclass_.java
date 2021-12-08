package automation;


import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Robotclass_ {
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Browserfiles/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		String parent = driver.getWindowHandle();
		System.out.println(parent);
		
		Set<String> child = driver.getWindowHandles();
		System.out.println(child);
		
		System.out.println(child.size());
		Thread.sleep(5000);
		child.remove(parent);
		for(String b:child)
		{
			driver.switchTo().window(b);
			System.out.println(driver.getTitle());
		}
		
		driver.close();
		
		
	}
	
		
		
		
		
		
		
	}
	


